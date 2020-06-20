package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class SqlTracker implements Store {

    private Connection cn;

    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public Item add(Item item) {
        item.setId(generateId());
        try (PreparedStatement st = cn.prepareStatement("INSERT INTO items (item_name, item_id) VALUES (?, ?)"))
        {
            st.setString(1, item.getName());
            st.setString(2, item.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public boolean replace(String id, Item item) {
        Item itemOfTable = findById(id);
        if (itemOfTable == null) {
            return false;
        }
        try (PreparedStatement st = cn.prepareStatement("UPDATE items SET item_name = ? WHERE item_id = ?"))
        {
            st.setString(1, item.getName());
            st.setString(2, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        Item itemOfTable = findById(id);
        if (itemOfTable == null) {
            return false;
        }
        try (PreparedStatement st = cn.prepareStatement("DELETE FROM items WHERE item_id = ?"))
        {
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        try (PreparedStatement st = cn.prepareStatement("SELECT item_name, item_id FROM items"))
        {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Item item = new Item(rs.getString("item_name"));
                item.setId(rs.getString("item_id"));
                items.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> items = new ArrayList<>();
        try (PreparedStatement st = cn.prepareStatement("SELECT item_name, item_id FROM items WHERE item_name = ?"))
        {
            st.setString(1, key);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Item item = new Item(rs.getString("item_name"));
                item.setId(rs.getString("item_id"));
                items.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public Item findById(String id) {
        Item item = null;
        try (PreparedStatement st = cn.prepareStatement("SELECT item_name FROM items WHERE item_id = ?")) {
            st.setString(1, id);
            {
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    Item temp = new Item(rs.getString("item_name"));
                    temp.setId(id);
                    item = temp;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
