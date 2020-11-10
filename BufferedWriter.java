package com.ex;
import java.io.*;  
public class BufferedWriter {  
public static void main(String[] args) throws Exception {     
    FileWriter fw = new FileWriter("C:\\jnit.txt");  
    BufferedWriter bw = new BufferedWriter(fw);  
    bw.write("i like India.");  
    bw.close();  
    System.out.println("yes");  
    }  
}  
