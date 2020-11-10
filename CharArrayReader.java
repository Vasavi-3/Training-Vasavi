package com.ex;
import java.io.CharArrayReader;  
public class CharArrayReader{  
  public static void main(String[] ag) throws Exception {  
    char[] ary = { 'v','a','s','a','v','i'};
    CharArrayReader car = new CharArrayReader(ary);  
    int i = 0;   
    while ((i = car.read()) != -1) {  
      char ch = (char) i;  
      System.out.print(ch + " : ");  
      System.out.println(i);  
    }  
  }  
}  
