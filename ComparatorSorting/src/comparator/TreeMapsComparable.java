package comparator;

import java.util.*;
//Here comparable is used to sort user defined Class Datatype so we need to implements
//Comparable or use Comparator
class Code implements Comparable<Code>{
	private String sectionno;
	private String lectureno;
	public Code(String sectionno, String lectureno) {
		this.sectionno=sectionno;
		this.lectureno=lectureno;
	}
	public String getSectionno() {
		return sectionno;
	}
	public String getLectureno() {
		return lectureno;
	}
	
	@Override
	public String toString() {
		return "Code [sectionno=" + sectionno + ", lectureno=" + lectureno + "]";
	}
	public int compareTo(Code o) {
		String s1=sectionno.concat(lectureno);
		String s2=o.getSectionno().concat(o.getLectureno());
		return s1.compareTo(s2);
	}
	
}
public class TreeMapsComparable {
	public static void main(String args[]) {
		Map<Code,String> mp = new TreeMap<>();
		mp.put(new Code("s01","L01"), "Programming");
		mp.put(new Code("s02","L02"), "Computer NEtworks");
		mp.put(new Code("s03","L03"), "Compiler Design");
		mp.put(new Code("s04","L04"), "Mysql");
		mp.put(new Code("s05","L05"), "DBMS");
		mp.put(new Code("s06","L06"), "OS");
		for(Map.Entry<Code, String> iterator : mp.entrySet()) {
			System.out.println("Key: " +iterator.getKey()+" Value: "+iterator.getValue());
		}
		
	}
}
