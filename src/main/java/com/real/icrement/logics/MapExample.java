package com.real.icrement.logics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "hello");
		map.put(2, "hero");
		map.put(3, "bhavagatsing");
		
		for(Entry<Integer, String> iter:map.entrySet()) {
			System.out.println(iter);
		}
		
	}
}
