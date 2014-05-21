/**
 * 
 */
package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author naresh
 * 
 */
class Game{
	public int i = 12;

	public Game() {
		i = 18;

	}

	public String toString() {
		return "Game" + i;

	}
}

public class HashSetDemo {
	public static void main(String[] args) {
		Integer[] array={2,1,3,5,4};
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(array));
		for(Object i:set){
			System.out.println(i.toString());
		}
		
		List<Integer> list=new ArrayList<Integer>(set);
		System.out.println("min"+list.get(0));
		System.out.println("max"+list.get(list.size()-1));
		
		Set<Game> hs = new TreeSet<Game>();
		hs.add(new Game());
	//hs.add(new Game());
		for (Game g : hs) {
			System.out.println(g);

		}
		
		
	}

}
