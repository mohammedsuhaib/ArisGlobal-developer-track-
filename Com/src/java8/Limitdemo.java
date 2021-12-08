package java8;
import java.lang.reflect.Array;
import java.util.*;
class stComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=(String)o1;
		String s2=(String)o2;
		return s1.compareTo(s2);
	}
	
}
public class Limitdemo {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("Suhaib");
	a.add("Faisal");
	a.add("Aheesh");
	a.add("Suhaib");
	//a.stream().
	System.out.println("Distinct Elements");
	a.stream().distinct().forEach(System.out::println);
	System.out.println("\nLimit");
	a.stream().limit(1).forEach(System.out::println);
	System.out.println("\nSorted");
	a.stream().sorted(new stComparator()).forEach(System.out::println);
	System.out.println("\nMap");
	a.stream().map(b->b.concat(b)).forEach(System.out::println);
	System.out.println("\nFilter");
	a.stream().filter(a1->a1.startsWith("A")).forEach(System.out::println);
	//System.out.println(a.stream().filter(a1->a1.equals("Suhaib")));
	//r.ints().limit(10).sorted().map(a->a).forEach(System.out::println);
}
}
