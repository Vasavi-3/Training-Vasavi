package com.ex;
import java.io.*;  
public class Reader
 {  
    public static void main(String[] args) {  
        try {  
            Reader reader = new FileReader("C:\\jnit.txt");  
            int i = reader.read();  
            while (i != -1) {  
                System.out.print((char) i);  
                i = reader.read();  
            }  
            reader.close();  
        } catch (Exception e) {  
            System.out.println(e.getMessage());  
        }  
    }  
}  
