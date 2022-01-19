package com.bridgelabz.oop.StockAccountManagement;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * This file connection Method is used to write a stock values into a file.
 *
 */
public class StockFileConnection {

    private static ObjectMapper mapper = new ObjectMapper(); //creating object of a Objectmapper.

    Stock stock = new Stock();
    File file = new File("Stock.json");

    
    /** 
     *  method for mapping json file into list of stock list  using  mapper
     * @return listOfStock
     * @throws java.io.IOException
     */
   
    public List<Stock> readFile() throws IOException {

        List<Stock> listOfStock = mapper.readValue(file, new TypeReference<List<Stock>>() {
        });
        return listOfStock;

    }
    /**
     *  method for writing a java object into json file.
     * @param listOfStock
     * @throws IOException 
     */
    
    public void writeFile(List<Stock> listOfStock) throws IOException {

        mapper.writerWithDefaultPrettyPrinter().writeValue(file, listOfStock);
    }
}