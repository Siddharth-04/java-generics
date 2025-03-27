package com.bridgelabz.onlinemarketplace.src;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog<T extends Product<?>> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (T product : products) {
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println(product.getCategory());
        }
    }
}
