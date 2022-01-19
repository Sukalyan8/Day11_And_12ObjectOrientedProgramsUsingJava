package com.bridgelabz.oop.StockAccountManagement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StockAccountManagement {

    private static Scanner scanner = new Scanner(System.in);

    // main function
    public static void main(String[] args) throws IOException {

        //creating ana object of stock operation class and stock file connection class.
        StockOperation operation = new StockOperation();
        StockFileConnection fileconnection = new StockFileConnection();

        /**
         * Getting Users input for add delete view value of each stock and total
         * stock value. if user choose 1 then stock file connection class will
         * call() and read file from list of stock. after that stock operation
         * class will call()and add stock method is done on list of stock.
         * finally file connection class will call() write file method to write
         * into json file.
         */
        System.out.println(" 1 : addStock ");
        System.out.println(" 2 : Delete Stock ");
        System.out.println(" 3 : Print Stock Report ");
        int choice = scanner.nextInt();

        do {
            switch (choice) {
                case 1:
                    List<Stock> listOfStock = fileconnection.readFile();
                    operation.addStock(listOfStock);
                    fileconnection.writeFile(listOfStock);
                    break;

                case 2:
                    List<Stock> listOfStock1 = fileconnection.readFile();
                    operation.deleteStock(listOfStock1);
                    fileconnection.writeFile(listOfStock1);

                    break;

                case 3:
                    List<Stock> listOfStock4 = fileconnection.readFile();
                    operation.stockReport(listOfStock4);
                    break;
            }
            System.out.println("If you want to perform more Operation Enter true Else false to exit ");
        } while (scanner.nextBoolean());
        scanner.close();
        System.out.println("Operation has performed");
    }

} // end of class