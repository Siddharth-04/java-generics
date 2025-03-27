package com.bridgelabz.smartwarehousemanagement.src;

public class SmartWarehouse {
    public static void main(String[] args) {
        // Electronics storage (using Integer IDs)
        Storage<Electronics<Integer>> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics<>("Laptop", 1000, 101));
        electronicsStorage.addItem(new Electronics<>("Smartphone", 800, 102));

        // Groceries storage (using String IDs)
        Storage<Groceries<String>> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries<>("Apples", 5, "G-001"));
        groceriesStorage.addItem(new Groceries<>("Milk", 3, "G-002"));

        // Furniture storage (using Long IDs)
        Storage<Furniture<Long>> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture<>("Chair", 50, 2001L));
        furnitureStorage.addItem(new Furniture<>("Table", 150, 2002L));

        // Displaying Items
        System.out.println("Electronics:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
//Electronics:
//Item id : 101
//Item name : Laptop
//Category : Electronics
//Price : 1000.0
//Item id : 102
//Item name : Smartphone
//Category : Electronics
//Price : 800.0
//
//Groceries:
//Item id : G-001
//Item name : Apples
//Category : Groceries
//Price : 5.0
//Item id : G-002
//Item name : Milk
//Category : Groceries
//Price : 3.0
//
//Furniture:
//Item id : 2001
//Item name : Chair
//Category : Furniture
//Price : 50.0
//Item id : 2002
//Item name : Table
//Category : Furniture
//Price : 150.0