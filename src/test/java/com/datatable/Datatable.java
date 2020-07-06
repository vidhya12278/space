package com.datatable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Datatable 
{
	public static void main(String[] args) 
	{
		//1 data without header
	List<String> l= new ArrayList();	
    l.add("course");
    l.add("java");
    l.add("selenium");
    l.add("framework");
    l.add("cucumber");
    
    String course = l.get(4);
    System.out.println("-----------1d without header-----------");
    System.out.println("particular course : " + course);
    
     //2 data without header
    List<ArrayList<String>> l1 =new ArrayList<ArrayList<String>>();
    
   ArrayList<String> a=new ArrayList<String>();
	a.add("xxx");
	a.add("tcs");
	a.add("chennai");
   ArrayList<String> a1=new ArrayList<String>();
	a1.add("xxy");
	a1.add("cts");
	a1.add("hydherbad");
  ArrayList<String> a2=new ArrayList<String>();
	a2.add("yyy");
	a2.add("ibm");
	a2.add("hydherbad");
/*ArrayList<String> a4=new ArrayList<String>();
	a4.add("xxy");
	a4.add("infosys");
	a4.add("hydherbad");*/
	
	//add into outerlist
	l1.add(a);
	l1.add(a1);
	l1.add(a2);
	//l1.add(a4);
	ArrayList<String> u = l1.get(2);
	String t = u.get(2);
	String y = u.get(1);
	System.out.println("---------2d without header----------");
	System.out.println("second arraylist : " + y     + t);
	 
// 1data with table
	Map<Integer,String> p=new LinkedHashMap<Integer,String>();
	
	p.put(1,"xxx");
	p.put(2, "infosys");
	p.put(3,"abc@gmail.com");
	
	System.out.println("-----------1d with header------------");
	String w = p.get(2);
	System.out.println("print company name : " + w);
	
//2d with table
	List<LinkedHashMap<Integer,String>> r= new ArrayList<LinkedHashMap<Integer,String>>();
	LinkedHashMap<Integer,String> k=new LinkedHashMap<Integer,String>();
	k.put(1, "xxx");
	k.put(2, "ibm");
	k.put(3, "manager");
	
	LinkedHashMap<Integer,String> k1=new LinkedHashMap<Integer,String>();
	k1.put(1, "xxx");
	k1.put(2, "tcs");
	k1.put(3, "tester");
	
	r.add(k);
	r.add(k1);
	LinkedHashMap<Integer, String> u1 = r.get(1);
	System.out.println("-------------2d with table=------------");
	System.out.println(u1);
	
	LinkedHashMap<Integer, String> g = r.get(0);
    String m = g.get(3);
    System.out.println(m);
	

	
	 
	
	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
