package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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
            throw new IllegalStateException("Connection failed. Check the arguments");
        }
    }

    @Override
    public Item add(Item item) {
        try (PreparedStatement st = cn.prepareStatement("INSERT INTO items (item_name) " +
                "VALUES (?)", Statement.RETURN_GENERATED_KEYS)) {
            st.setString(1, item.getName());
            st.executeUpdate();
            try (ResultSet rs = st.getGeneratedKeys()) {
                if (rs.next()) {
                    item.setId(rs.getString(1));
                    return item;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Could not create new user");
    }

    @Override
    public boolean replace(String id, Item item) {
        try (PreparedStatement st = cn.prepareStatement("UPDATE items SET item_name = ? WHERE id = ?")) {
            st.setString(1, item.getName());
            st.setInt(2, Integer.parseInt(id));
            int rowsReplaced = st.executeUpdate();
            if (rowsReplaced == 0) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        try (PreparedStatement st = cn.prepareStatement("DELETE FROM items WHERE id = ?")) {
            st.setInt(1, Integer.parseInt(id));
            int rowsDeleted = st.executeUpdate();
            if (rowsDeleted == 0) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        try (PreparedStatement st = cn.prepareStatement("SELECT * FROM items")) {
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Item item = new Item(rs.getString("item_name"));
                    item.setId(rs.getString("id"));
                    items.add(item);
                }
                return items;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Could not to get application list");
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> items = new ArrayList<>();
        try (PreparedStatement st = cn.prepareStatement("SELECT * FROM items WHERE item_name = ?")) {
            st.setString(1, key);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Item item = new Item(rs.getString("item_name"));
                    item.setId(rs.getString("id"));
                    items.add(item);
                }
                return items;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Could not to get application list");
    }

    @Override
    public Item findById(String id) {
        try (PreparedStatement st = cn.prepareStatement("SELECT item_name FROM items WHERE id = ?")) {
            st.setInt(1, Integer.parseInt(id));
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    Item item = new Item(rs.getString("item_name"));
                    item.setId(id);
                    return item;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }
}
