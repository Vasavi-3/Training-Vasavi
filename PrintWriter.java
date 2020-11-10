package com.ex;
import java.io.File;  
import java.io.PrintWriter;  
public class PrintWriter {  
    public static void main(String[] args) throws Exception {  
      PrintWriter a= new PrintWriter(System.out);    
      a.write("Java language provides all technology.");        
      a.flush();  
      a.close();     
      PrintWriter a =null;      
         a1 = new PrintWriter(new File("C:\\jnit.txt"));  
        a1.write("Like Java, Spring, Hibernate, Android, etc.");                                                   
         a1.flush();  
         a1.close();  
    }  
}  