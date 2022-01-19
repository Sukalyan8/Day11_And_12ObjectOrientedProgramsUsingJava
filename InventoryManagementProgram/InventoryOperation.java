package com.bridgelabz.oop.InventoryManagementProgram;


import java.util.List;
import java.util.Scanner;

  /**
     *  Here  inventory items will be added
     *  user will give the desired name for stock price and weight and then that input
     *  is added toh the inventory and file connector also update to the json file.
     * 
    */

public class InventoryOperation {

    Scanner sc = new Scanner(System.in);

    public void addInventory(List<InventoryModel> listOfInventory) {
        do {
           InventoryModel inventory = new InventoryModel();

            System.out.println("Enter the Items Name");
            inventory.setName(sc.next());

            System.out.println("Enter the price of Items");
            inventory.setPrice(sc.nextInt());

            System.out.println("Enter the weight of Items");
            inventory.setWeight(sc.nextInt());

            listOfInventory.add(inventory);

            System.out.println("if Enter more Inventory enter true else false");
        } while (sc.nextBoolean());
    }
    
    /**
     *  Here  inventory items will be deleted
     * for loop will check for list of inventory  that user entered for stock name and then if matched
     * it will delete and update the inventory.
     * @param listOfInventory
     * @return 
    */

    public List<InventoryModel> deleteInventory(List<InventoryModel> listOfInventory) {
        System.out.println("Enter the Item Name: ");
        String name = sc.next();
        for (int i = 0; i < listOfInventory.size(); i++) {
            if (listOfInventory.get(i).getName().equals(name)) {
                listOfInventory.remove(i);
            }
        }
        return listOfInventory;
    }

    /**
     *  Here Total Price of inventory items is calculated.
     * for loop will check for list of inventory  that user entered for items name and then if matched
     * it will show the output.
     * @param listOfInventory
    */
    
    public void Inventoryvalue(List<InventoryModel> listOfInventory) {
        System.out.println("Enter the Item Name");
        String name = sc.next();

        for (int i = 0; i < listOfInventory.size(); i++) {
            if (listOfInventory.get(i).getName().equals(name)) {
                InventoryModel temp = listOfInventory.get(i);
                int value = temp.getPrice() * temp.getWeight();
                System.out.println(" The value of " + temp.getName() + " is : " + value);
            }else{
                System.out.println("Item with these name is not found...");
            }
        } //end of for loop
    }

} // end of class