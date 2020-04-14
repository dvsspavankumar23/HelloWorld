package comparator;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
	private K key;
	private V value;
	public Data(K key, V value) {
		super();
		this.key = key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	
}
public class App {
	public static void main(String args[]) {
		Comparator<Data<Integer,String>> comp= new Comparator<Data<Integer,String>>() {

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
				// TODO Auto-generated method stub
				if(o1.getKey()== o2.getKey())
						return 0;
				else if(o1.getKey()>=o2.getKey())
						return 1;
				else
						return -1;
			}
			
		};
		Set<Data<Integer,String>> sets= new TreeSet<>(comp);
		sets.add(new Data<Integer, String>(1,"pavan"));
		sets.add(new Data<Integer, String>(5,"pava"));
		sets.add(new Data<Integer, String>(4,"pav"));
		sets.add(new Data<Integer, String>(2,"pa"));
		sets.add(new Data<Integer, String>(2,"p"));
		/*Set<Data<Integer,String>> sets= new HashSet<>();
		sets.add(new Data<Integer, String>(1,"pavan"));
		sets.add(new Data<Integer, String>(2,"pava"));
		sets.add(new Data<Integer, String>(3,"pav"));
		sets.add(new Data<Integer, String>(4,"pa"));
		sets.add(new Data<Integer, String>(5,"p"));*/
		for(Data<Integer, String> element : sets) {
			System.out.println(element);
		}
	}
}
