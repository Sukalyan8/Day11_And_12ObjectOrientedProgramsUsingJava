package com.bridgelabz.oop.InventoryManagementProgram;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class InventoryManager {
    
    /**
     * This is the main menu here add delete and also cane view the value of each inventory
     * if a user choice is 1 then,file connector will read json file and map into list
     * inventory operation class is for managing add delete methods of inventory
     * 
     * @throws IOException 
     */

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1 : addInventory items");
        System.out.println(" 2 : Delete Inventory");
        System.out.println(" 3 : Total Price Of each Items");

        int choice = scanner.nextInt();
        InventoryOperation inventoryoperation = new InventoryOperation();
        FileConnector fileconnector = new FileConnector();
        

        do {
            switch (choice) {
                case 1:

                    List<InventoryModel> listOfInventory = fileconnector.readFile();
                    inventoryoperation.addInventory(listOfInventory);
                    fileconnector.writeFile(listOfInventory);
                    break;

                case 2:

                    List<InventoryModel> listOfInventory1 = fileconnector.readFile();
                    inventoryoperation.deleteInventory(listOfInventory1);
                    fileconnector.writeFile(listOfInventory1);

                    break;
                case 3:
                    List<InventoryModel> listOfInventory2 = fileconnector.readFile();
                    inventoryoperation.Inventoryvalue(listOfInventory2);
                    break;
            }
            System.out.println("If you want to perform more Operation Enter true");
        } while (scanner.nextBoolean());
        scanner.close();
        System.out.println("Operation has performed");
    }
} //end of class