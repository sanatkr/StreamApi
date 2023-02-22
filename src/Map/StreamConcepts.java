package Map;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		
		// name of the employee having salary greater than 300
		List<String> empName = list.stream().filter(emp -> emp.getSalary()>300).map(emp -> emp.getFirstName()).collect(Collectors.toList());
		System.out.println(empName);
		
		
		//filter name which starts with s and length greater than 3
		list.stream().filter(emp -> emp.getFirstName().startsWith("s")).filter(emp -> emp.getFirstName().length()>3).map(emp -> emp.getFirstName()).forEach(System.out::println);
		
		// another way
		Predicate<Employee> p1 = e -> e.getFirstName().startsWith("s");
		
		Predicate<Employee> p2 = e -> e.getFirstName().length() >3;
		
		list.stream().filter(p1.and(p2)).map(emp -> emp.getFirstName()).forEach(System.out::println);
		
		
		
		
		
		
	}

}
