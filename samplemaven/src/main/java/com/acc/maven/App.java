package com.acc.maven;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	NavigableMap<Integer,String>map1 =new TreeMap<>();
    	map1.put(1,"tit");
    	map1.put(2,"yyo");
    	map1.put(3,"uui");
    	System.out.println("the key is decending order is:"+map1.descendingMap());
    }
}
