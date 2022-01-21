package com;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList da=new LinkedList();
		da.add("Kim Seokjin");
		da.add("Jung Hoseok");
		da.add("Kim Taehyung");
		da.add("Kim Namjoon");
		da.add("Park Jimin");
		da.add("Min Yoongi");
		da.add("Jeon Jungkook");
		
		System.out.println("Removing Last element:"+da.removeLast());
		System.out.println("Assign First element:"+da.getFirst());
		
		LinkedList<String> marauders=new LinkedList<String>();
		marauders.add(0,"Seongwa");
		marauders.add(1,"Mingi");
		marauders.add(2,"Wooyoung");
		marauders.add(3,"Yeosang");
		
		String[] otherCharacter=new String[] {"Lee Know","Hwang Hyunjin","Bang Chan","I.N"};
		
		LinkedList impCharacter=new LinkedList(marauders);
		impCharacter.add(otherCharacter);
		impCharacter.add(0,"Hwang Yeji");
		
		System.out.println("Kpop idols");
		Iterator i=da.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		System.out.println();
		System.out.println("Important Character");
		for (Object object:impCharacter) {
			if(object.getClass()==(otherCharacter.getClass()))
			{
				//for array inside collection
				for(String s:otherCharacter) {
					System.out.println(s);
				}
		}
			else
				System.out.println(object);
		}
			
	}

}
