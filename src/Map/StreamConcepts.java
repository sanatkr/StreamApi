package Map;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamConcepts {

	public static void main(String[] args) {
		
		
		
		List<Employee> list = EmpDatabase.get();
		
		// using map (one to one mappping)
		List<String> res1 = list.stream().map(emp -> emp.getFirstName()).collect(Collectors.toList());
		
		System.out.println(res1);
		
		//using flatMap
		
		List<String> res2 = list.stream().flatMap(emp -> emp.getProjects().stream()).collect(Collectors.toList());
		System.out.println(res2);
		
		// using reduce()
		Double reduce = list.stream().map(emp -> emp.getSalary()).reduce(0.0,Double::sum);
		
		System.out.println("Total sum is :"+reduce);
		
		// using max
		Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
		
		System.out.println("maximum salary is :"+max.get().getSalary());
		
	}

}