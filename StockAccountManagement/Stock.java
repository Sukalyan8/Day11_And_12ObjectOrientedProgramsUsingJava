package com.bridgelabz.oop.StockAccountManagement;

/**
 *  This is the model file for Stock 
 *  getters and setters has been applied here.
 */

public class Stock {

    private String stockName;
    private int Price;
    private int numberOfShare;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

}