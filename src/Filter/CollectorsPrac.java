package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Employee
{
	int roll;
	String name;
	Employee(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + "]";
	}
	
	
}

public class CollectorsPrac {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"sanat"));
		list.add(new Employee(1,"durga"));
		
		list.add(new Employee(2,"aman"));
		list.add(new Employee(2,"sharma"));
		
		Map<Boolean,List<Employee>> res = list.stream().collect(Collectors.partitioningBy(emp -> emp.getRoll()>1));
		
		Map<Integer,List<Employee>> res1 = list.stream().collect(Collectors.groupingBy(emp -> emp.getRoll()));
		
		Map<Integer,Long> res2 = list.stream().collect(Collectors.groupingBy(emp -> emp.getRoll(),Collectors.counting()));
		
		list.stream().forEach(System.out::println);
		
		for(Map.Entry m1:res.entrySet())
		{
			System.out.println(m1.getKey()+" ===== "+m1.getValue());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		for(Map.Entry m2:res1.entrySet())
		{
			System.out.println(m2.getKey()+" ===== "+m2.getValue());
		}
		
		System.out.println(res2);
	}

}
