package com.ex;
import java.io.*;  
public class StringWriter
{  
    public static void main(String[] args) throws IOException {  
        char[] ary = new char[620];  
        StringWriter sw = new StringWriter();  
        FileInputStream fis = null;  
        BufferedReader br = null;  
        fis = new FileInputStream("C://jnit.txt");  
        br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));  
        int x;  
        while ((x = br.read(ary)) != -1) {  
                   sw.write(ary, 0, x);  
        }  
        System.out.println(sw.toString());        
        sw.close();  
        br.close();  
    }
}
