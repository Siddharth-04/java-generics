package com.bridgelabz.smartwarehousemanagement.src;

class Electronics <T> extends WarehouseItem<T> {
    public Electronics(String itemName, double itemPrice,T itemId) {
        super(itemName,itemId,itemPrice);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
