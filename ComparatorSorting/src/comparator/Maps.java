package comparator;

import java.util.*;
//import java.util.Map.Entry;
public class Maps{
	public static void main(String args[]) {
		Map<Integer,String> mp = new HashMap<>();
		//mp.put(1,"pavan");
		mp.put(1, "THe Dv");
		mp.put(2,"He is the B.O.S.S");
		mp.put(3,"The Devil");
		for(Map.Entry<Integer,String> ent : mp.entrySet()) {
			System.out.println(ent.getKey()+":"+ent.getValue());
		}
		for(Integer a: mp.keySet()) {
			System.out.println(a + mp.get(a));
		}
	}
}
