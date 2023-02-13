package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FilterLearn {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(9);
		
		List<Integer> res = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(res);
		
		System.out.println("Enhanced for loop: ");
		for(Integer r:res)
		{
			System.out.println(r);
		}
		
		System.out.println("for each loop, using lambda expression: ");
		res.forEach(i->System.out.println(i));
		
		System.out.println("for each loop, using anonymous innner class");
		res.forEach(new Consumer<Integer>()
				{
					public void accept(Integer i)
					{
						System.out.println(i);
					}
				});
		
		
		System.out.println("using for each loop,method reference ");
		res.forEach(System.out::println);
		
		
	}

}
