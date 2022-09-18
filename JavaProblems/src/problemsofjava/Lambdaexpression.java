package problemsofjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdaexpression {

 public static void main(String[] args) {

	 
//	 Predicate<Integer> pr=i->(i>20);
//	 
//	 System.out.println("the value here is : "+pr.test(25));
	 
	 
		/*
		 * List<String> al =
		 * Arrays.asList("manoj","bad","little","that","good","by","moving","goodforyou"
		 * );
		 * 
		 * 
		 * // my req word should be > 4 and < 6
		 * 
		 * List<String> correct_word=al.stream().filter(a->a.length()>4 &&
		 * a.length()<6).collect(Collectors.toList()); List<String>
		 * correct_wording=al.stream().map(a->a+" i am good -> ").collect(Collectors.
		 * toList()); al.stream().filter(a->a.length()>4 &&
		 * a.length()<6).forEach(System.out::println);
		 * 
		 * System.out.println(correct_wording);
		 */
	 
	 
	 
	List<String> numbers=Arrays.asList("manoj","amar","dravid","mass");
	
	List<String> after_filter=numbers.stream().filter(m->m.length()>2 && m.length()<5).collect(Collectors.toList());
	numbers.stream().filter(m->m.length()>2 && m.length()<5).forEach(System.out::println);
	/*
	 * System.out.println(after_filter.get(0));
	 * System.out.println(after_filter.get(1));
	 * 
	 * for(String ele: after_filter) { System.out.println(ele); }
	 */
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 ArrayList<String>  al =new ArrayList<String>(Arrays.asList(arr));
//	  
//	 System.out.println(" the elements available here in : "+al);
//	 
//	 for(String e : al) {
//		 System.out.println(e);
//	 }
//		 
//	 System.out.println(al.contains("good"));
//	 
//	 
//	 }
//	 
	 
 }
 }
