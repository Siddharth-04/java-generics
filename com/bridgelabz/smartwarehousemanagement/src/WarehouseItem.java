package com.bridgelabz.smartwarehousemanagement.src;

public abstract class WarehouseItem<T> {
    private String itemName;
    private T itemId;
    private double itemPrice;

    WarehouseItem(String itemName, T itemId, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemId = itemId;
    }

    public abstract String getCategory();

    public String getItemName() {
        return itemName;
    }

    public T getItemId() {
        return itemId;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
