/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.automateimport;

/**
 *
 * @author tiniv_000
 */
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class automateImport
{
    public static void main(String[] args) 
    {
        DBase db = new DBase();
        Connection conn = db.connect(
    "jdbc:mysql://localhost:3306/trade?zeroDateTimeBehavior=convertToNull","root","1");
        File folder = new File("E:\\Documents\\NetBeansProjects\\AsyncReq\\data");
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() ) {
                
            String fileN="E:\\\\Documents\\\\NetBeansProjects\\\\AsyncReq\\\\data\\\\"+file.getName();
              db.importData(conn,fileN);
                      }
              /* do somthing with content */
            } 
        
//        while(folder.length()>0)
//        {
//            try{
//                db.importData(conn,folder.listFiles()[0].getName());
//                String tempFileName= folder.listFiles()[0].getName;
//                String fileName= tempFileName;
//                String serverPath="/insert/";
//                File serverFile = new File(serverPath+fileName);
//
//                Files.copy(Paths.get(tempFileName),Paths.get(serverFile.getName()),
//                   StandardCopyOption.COPY_ATTRIBUTES,StandardCopyOption.REPLACE_EXISTING);
//
//                if(serverFile.exists()){serverFile.setWritable(true, false);}
//
//                Files.copy(Paths.get(tempFileName),Paths.get(serverPath+fileName),
//                   StandardCopyOption.COPY_ATTRIBUTES,StandardCopyOption.REPLACE_EXISTING);
//
//                serverFile.setWritable(false,false);
//
//                Files.delete(Paths.get(tempFileName));
//            }
//            catch(Exception e)
//            {
//                 System.err.println(e.getMessage());
//            }
//        }
        
        
    }
    

    


}