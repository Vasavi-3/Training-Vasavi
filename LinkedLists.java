package clctn;

import java.util.LinkedList;

public class LinkedLists {
public static void main(String args[])
{
	LinkedList<Integer> s1=new LinkedList<Integer>();
	s1.add(1);
	s1.add(2);
	s1.add(6);
	s1.add(3);
	s1.add(4);
	s1.add(5);
	s1.add(6);
	System.out.println(s1);
	for(int i=0;i<s1.size();i++)
	{
		for(int j=i+1;j<s1.size();j++)
{
			if(s1.get(i)==s1.get(j))
			{
				System.out.println(s1.get(i));
				
			}
	
}
	}
	
	
}
}
