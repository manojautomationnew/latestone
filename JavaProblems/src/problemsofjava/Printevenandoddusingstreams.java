package problemsofjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Printevenandoddusingstreams {

	
	
	
	public static void main(String[] args) {
		
		/*
		 * Long lan=IntStream.range(10,56).filter(e->e%2!=0).count();
		 * System.out.println("count : "+lan);
		 */
		
		// req find the no's starting with the 2
		
		List<Integer> num=Arrays .asList(21,23,25,454,5455,5445,5454,5454,588,5451,96,23,45,12,26,212,266);
		/*
		 * List<Integer>
		 * startsWithTwo=num.stream().map(String::valueOf).filter(k->k.startsWith("2")).
		 * map(Integer::valueOf).collect(Collectors.toList());
		 * 
		 * System.out.println(startsWithTwo.get(2).equals(25));
		 */
		/*
		 * System.out.println(num.stream().map(String::valueOf).filter(e ->
		 * e.startsWith("2")).map(Integer::valueOf) .collect(Collectors.toList()));
		 */
		
		// display the duplicates
		
		/*
		 * Set<Integer>
		 * afterRemovingDuplicates=num.stream().filter(n->Collections.frequency(num,
		 * n)>1).collect(Collectors.toSet());
		 * System.out.println("the count of the duplicates in numbers : "
		 * +afterRemovingDuplicates);
		 */
		
		
		// find max
		
		
		
//		System.out.println(" the minimum value in provided number : "+min(10,20,35));
	
	
	/*static int min(int a, int b, int c) {
		int min = 0;

		while (a > 0 && b > 0 && c > 0) {

			a--;
			b--;
			c--;
			min++;

		}

		return min;

	}*/
	
	
	/*
	 * System.out.println("the maximum value for the given list of numbers : "+
	 * max(855,486,4545)); }
	 * 
	 * 
	 * static long max(int a, int b, int c) {
	 * 
	 * int max = 0;
	 * 
	 * while (a > 0 || b > 0 || c > 0) {
	 * 
	 * a--; b--; c--; max++;
	 * 
	 * }
	 * 
	 * return max;
	 */

		// find the maximum among them
		
		List<Integer> numbers=Arrays.asList(258955,566,223,889,554,5454,2512,1545,454,515,454,5,545,4454);
		
	Optional<Integer> maxNum=	numbers.stream().reduce((a,b)->a-b);
		
		
		System.out.println(maxNum.get());
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
}
