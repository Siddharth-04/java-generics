package com.bridgelabz.smartwarehousemanagement.src;

import java.util.ArrayList;

public class Storage <T extends WarehouseItem> {

    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public static void displayItems(ArrayList<? extends WarehouseItem<?>> items) {
        for (WarehouseItem<?> item : items) {
            System.out.println("Item id : "+item.getItemId());
            System.out.println("Item name : "+item.getItemName());
            System.out.println("Category : "+  item.getCategory());
            System.out.println("Price : " + item.getItemPrice());
        }
    }
}
