package com.xworks.collect.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FreedomFightersTester {
	public static void main(String[] args) {
		List<String> ffList = new ArrayList<String>();
		ffList.add("Gandhi");
		ffList.add("Nehru");
		ffList.add("Chennamma");
		ffList.add("Bose");
		ffList.add("Bhagath Singh");
		
		Iterator<String> itr = ffList.iterator();
		while(itr.hasNext()) {
			String elemString = itr.next();
			System.out.println(elemString);
			if(elemString.equals("Gandhi")){
				itr.remove();
			}
		}
		
		System.out.println("===========Accessing in the middle at an index==============");
		System.out.println(itr.next());
		
		ListIterator<String> listItr = ffList.listIterator(2);
		while(listItr.hasNext()) {
			String elem = listItr.previous();
			System.out.println(elem);
			String elemNext = listItr.next();
			System.out.println(elemNext);
			if(elem.equals("Chennamma")) {
				listItr.add("Rani Channamma");
			}
		}
		System.out.println("===========Accessing from the bottom==============");
		ListIterator<String> listItr2 = ffList.listIterator(ffList.size());
		while(listItr.hasNext()) {
			String elem = listItr2.previous();
			System.out.println(elem);
			String elemNext = listItr2.next();
			System.out.println(elemNext);
			if(elem.equals("Chennamma")) {
				listItr2.add("Rani Channamma");
			}
		}
	}

}
