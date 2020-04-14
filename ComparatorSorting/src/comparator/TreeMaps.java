package comparator;

//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
	//TreeMap sorts the elements in the Map
	//So we need to add Comparator in order to Sort
	public static void main(String args[]) {
		Map<Integer,String> mp = new TreeMap<>();
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
