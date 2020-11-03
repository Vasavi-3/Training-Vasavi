package com.rs;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map {


	public static void main(String args[])
	{
		TreeMap<Integer,String>v=new TreeMap<Integer,String>();
		v.put(2053, "vasu");
		v.put(3053,"sony");
		v.put(4509, "sweety");
		v.put(3256,"chinna");
		System.out.println(v);
		Set<Entry<Integer,String>> s=v.entrySet();
		for(Entry<Integer, String> x:s)
		{
			System.out.println(x.getKey()+""+x.getValue());
			
		}
		
		
	}

}