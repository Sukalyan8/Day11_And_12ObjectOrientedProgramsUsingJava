package com.bridgelabz.oop.StockAccountManagement;

import java.util.List;
import java.util.Scanner;

public class StockOperation {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Here add stock method is for adding stock name stock share and number of
     * share.
     *
     * @param listOfStock
     */
    
    public void addStock(List<Stock> listOfStock) {
        do {
            Stock stock = new Stock();

            System.out.println("Enter the Stock Name");
            stock.setStockName(scanner.next());

            System.out.println("Enter the price of stock share");
            stock.setPrice(scanner.nextInt());

            System.out.println("Enter the number of share");
            stock.setNumberOfShare(scanner.nextInt());
            listOfStock.add(stock);
            System.out.println("if Enter more stock enter true else False to exit ");
        } while (scanner.nextBoolean());
    }

    /**
     * This method is used to delete the stock
     *
     * @return listodStock
     * @param listOfStock
     */
    
    public List<Stock> deleteStock(List<Stock> listOfStock) {
        System.out.println("enter the stock name ");
        String name = scanner.next();
        for (int i = 0; i < listOfStock.size(); i++) {
            if (listOfStock.get(i).getStockName().equals(name)) {
                listOfStock.remove(i);
            }
        }
        return listOfStock;
    }

    /**
     * This method is used to print stock report. here stock value for each
     * stock is calculated and also total stock value and then print it.
     *
     * @param listOfStock
     */
    
    public void stockReport(List<Stock> listOfStock) {
        int totalStockValue = 0;

        // loop for calculating value for each stock.
        for (int i = 0; i < listOfStock.size(); i++) {
            Stock temp = listOfStock.get(i);
            int eachStockValue = temp.getPrice() * temp.getNumberOfShare();
            totalStockValue = totalStockValue + temp.getPrice() * temp.getNumberOfShare();
            System.out.println("the value of " + temp.getStockName() + " is : " + eachStockValue);
        }
        System.out.println(" Total value of Stock is " + totalStockValue);
    }

} // end of class