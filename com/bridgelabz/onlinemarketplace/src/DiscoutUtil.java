package com.bridgelabz.onlinemarketplace.src;

class DiscountUtil<T extends Product<?>> {
    public void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}