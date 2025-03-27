package com.bridgelabz.smartwarehousemanagement.src;

class Furniture <T> extends WarehouseItem<T> {
    public Furniture(String itemName, double itemPrice,T itemId) {
        super(itemName,itemId,itemPrice);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}
