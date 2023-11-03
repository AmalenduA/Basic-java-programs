package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List1 {
	public static void main(String[] args) {
		ArrayList arl=new ArrayList<>();
		arl.add(2);
		arl.add(3);
		arl.add(4);
		arl.add(5);
		arl.add(6);
		System.out.println(arl);
		System.out.println(arl.clone());
		System.out.println(arl.isEmpty());
		System.out.println(arl.size());
		System.out.println(arl.contains(3));
		Iterator itr=arl.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
