package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {

	public static void main(String[] args) {
		
		List<Employe> list = new ArrayList<>();
		
		list.add(new Employe(1,"sanat",90,"A"));
		list.add(new Employe(2,"aman",98,"B"));
		list.add(new Employe(3,"sahil",95,"A"));
		list.add(new Employe(4,"rajiv",93,"C"));
		list.add(new Employe(5,"gaurav",95,"A"));
		list.add(new Employe(6,"sumit",92,"B"));
		
//		System.out.println(list);
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
//	
//		list.forEach(i->System.out.println(i));
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		list.forEach(System.out::println);
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		list.stream().forEach(System.out::println);
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Map<String,List<Employe>> res = list.stream().collect(Collectors.groupingBy(e->e.getSection()));
		
		res.forEach((k,v)->System.out.println(k +" "+v));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		Map<String,List<Employe>> res1 = list.stream().collect(Collectors.groupingBy(Employe::getSection));
		
		res.forEach((k,v)->System.out.println(k +" "+v));
		
		
		
		
		

	}

}
