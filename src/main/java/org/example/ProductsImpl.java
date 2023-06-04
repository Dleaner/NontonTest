package org.example;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String id;
    private String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ProductsImpl {
    private List<Product> products;

    public ProductsImpl() {
        this.products = new ArrayList<>();
    }

    public boolean addProduct(Product product) {
        for (Product p : products) {
            if (p.getId().equals(product.getId())) {
                return false;
            }
        }
        products.add(product);
        return true;
    }

    public boolean deleteProduct(Product product) {
        return products.remove(product);
    }

    public String getName(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product.getName();
            }
        }
        return "";
    }

    public List<String> findByName(String name) {
        List<String> ids = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                ids.add(product.getId());
            }
        }
        return ids;
    }
}