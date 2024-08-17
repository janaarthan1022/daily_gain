package datastructures.linkedlist;

import java.util.HashMap;
import java.util.Map;

///Garbage colleciton example
public class Test {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		Map<String, Integer> map3 = new HashMap<>();
		map1.put("value", 11);
		map2 = map1;
		map1.put("value", 22); //Collected as Garbage
		map3.put("value", 57);
		map2 = map3;
		map1 = map2;
		System.out.println("Map1 = " + map1);
		System.out.println("Map2 = " + map2);
		System.out.println("Map3 = " + map3);

	}

}
