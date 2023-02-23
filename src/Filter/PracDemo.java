package Filter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PracDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,25,3,9,1,4,8,4,25);
		
		// get distinct elements
		List<Integer> distinctElements = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct elements are ->"+distinctElements);
		
		// get duplicate elements
		Set<Integer> duplicateElement = list.stream().filter(i -> Collections.frequency(list,i)>1).collect(Collectors.toSet());
		System.out.println("duplicate Elements are ->"+duplicateElement);
		
		
	}

}
