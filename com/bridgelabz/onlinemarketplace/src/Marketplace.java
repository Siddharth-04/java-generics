package com.bridgelabz.onlinemarketplace.src;

// Main class for testing
public class Marketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("The Great Gatsby", 15.99, new BookCategory("Fiction"));
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 9.99, new ClothingCategory("Men"));
        Product<GadgetCategory> phone = new Product<>("Smartphone", 499.99, new GadgetCategory("Mobile"));

        ProductCatalog<Product<?>> catalog = new ProductCatalog<>();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount:");
        catalog.displayCatalog();

        DiscountUtil<Product<?>> discountUtil = new DiscountUtil<>();
        discountUtil.applyDiscount(book, 10);
        discountUtil.applyDiscount(shirt, 15);
        discountUtil.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        catalog.displayCatalog();
    }
}
//Before Discount:
//The Great Gatsby
//15.99
//Fiction
//T-Shirt
//9.99
//Men
//Smartphone
//499.99
//Mobile
//
//After Discount:
//The Great Gatsby
//14.391
//Fiction
//T-Shirt
//8.4915
//Men
//Smartphone
//474.9905
//Mobile