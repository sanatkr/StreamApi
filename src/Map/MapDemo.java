package Map;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		
		
		List<Employee> list = EmpDatabase.get();
		
		// using map (one to one mappping)
		List<String> res1 = list.stream().map(emp -> emp.getFirstName()).collect(Collectors.toList());
		
		System.out.println(res1);
		
		//using flatMap
		
		List<String> res2 = list.stream().flatMap(emp -> emp.getProjects().stream()).collect(Collectors.toList());
		System.out.println(res2);
		
	}

}
