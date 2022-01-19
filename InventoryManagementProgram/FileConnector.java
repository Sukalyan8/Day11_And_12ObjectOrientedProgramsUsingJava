package com.bridgelabz.oop.InventoryManagementProgram;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *  This class is responsible for file operation like reading json file and writing into json file. 
 * 
 */

public class FileConnector {

    private static ObjectMapper mapper = new ObjectMapper();

    // files location for read and write process.
     File readFile = new File("Inventory.json");
     File writeFile =  new File("D:\\InventoryOutput.json");
     
    
    /**
     *  method for mapping json object into list of inventory list  using  mapper. 
     *  @return 
     *  @throws java.io.IOException 
       */
       
    public List<InventoryModel> readFile() throws IOException {
        List<InventoryModel> listOfInventory = mapper.readValue(readFile, new TypeReference<List<InventoryModel>>() {
        });
        return listOfInventory;
    }

    
    /**
     *  method for writing a java object into json file. 
     * @param listOfInventory
     * @throws java.io.IOException
       */
 
    
    public void writeFile(List<InventoryModel> listOfInventory) throws IOException {

        mapper.writerWithDefaultPrettyPrinter().writeValue(writeFile, listOfInventory);

    }

}