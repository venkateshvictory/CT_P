package com.real.icrement.logics;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;


public class ReverseStringWordByWordProg {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "venkatesh");
		map.put(102,"raju");
		map.put(104,"Hero");
		for(java.util.Map.Entry<Integer, String> entry:map.entrySet()) {
	
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
			
		
	}
}
