package Map;

import java.util.ArrayList;
import java.util.List;

public class EmpDatabase {
	
	public static List<Employee> get()
	{
		List<Employee> list = new ArrayList<>() {{
			
			add(new Employee("sanat","kumar",100.0,List.of("p1","p2")));
			add(new Employee("rajiv","ranjan",400.0,List.of("p2")));
			add(new Employee("sahil","pandey",700.0,List.of("p3","p4")));
			add(new Employee("ankit","jaiswal",300.0,List.of("p1","p2")));
			add(new Employee("anuj","singh",500.0,List.of("p8","p9")));
			
		}};
		return list;
	}
}
