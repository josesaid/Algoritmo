package com.mx.development;
import java.io.IOException;

import org.apache.commons.io.FileSystemUtils;

/**
 * @author josesaidolanogarcia
 */
public class IOTester3 {

    public static void main(String[] args) {
        try{
            long size = FileSystemUtils.freeSpaceKb("/");

            // Convertir a gigabytes
            long sizeGB = size / (1024 * 1024);

            System.out.println("Free Space " + sizeGB + " GB");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}