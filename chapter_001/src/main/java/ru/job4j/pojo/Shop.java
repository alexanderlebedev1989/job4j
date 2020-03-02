package ru.job4j.pojo;

public class Shop {

    public Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;

        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] prods = new Product[4];
        prods[1] = new Product("Milk", 10);
        prods[2] = new Product("Bread", 4);
        prods[3] = new Product("Egg", 19);

        Shop shop = new Shop();
        shop.delete(prods, 0);
    }
}

