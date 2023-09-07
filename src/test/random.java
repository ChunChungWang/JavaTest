package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class random {
	public static void main(String args[]) {
	Set set = new HashSet();
	while(set.size() < 6) {
		int x = (int)(Math.random()*49)+1;
		set.add(x);
	}
	Iterator objs = set.iterator();
	while (objs.hasNext())
		System.out.println(objs.next());

}
}