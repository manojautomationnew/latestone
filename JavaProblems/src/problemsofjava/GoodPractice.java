package problemsofjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class GoodPractice {

	public static void main(String[] args) {

//		List<Integer> al=Arrays.asList(25,88,99,66,889,5454,545,454,541,21,4,8,4,545,48,748,5,125,14,54);
//		
//		
//		System.out.println(Collections.max(al));
		
		/*
		 * String s="my name is manoj i am very good boy"; StringBuilder sb= new
		 * StringBuilder( s).reverse();
		 * 
		 * System.out.println(sb);
		 */

		
		
		// to find the no of vowels in string
		
		/*
		 * System.out.println("enter a string ........");
		 * 
		 * // Scanner sc=new Scanner(System.in); // String sen=sc.nextLine(); String
		 * sen="good morning";
		 * 
		 * char[] ch=sen.toCharArray();
		 * 
		 * int count=0;
		 * 
		 * for(char c:ch) {
		 * 
		 * switch(c) {
		 * 
		 * case 'a': case 'e': case 'i': case 'o': break; case 'u':
		 * 
		 * 
		 * System.out.println("i am a good boy"); System.out.println("i am a bad boy");
		 * 
		 * count++; } }
		 * 
		 * 
		 * System.out.println("the count of vowel in a string : "+count);
		 */
		
		
		
		/*
		 * String string = "hai this is good to come hello"; String[] wordAr =
		 * string.split(" "); for (String s : wordAr) {
		 * System.out.println(s.replaceAll("(?i)[^aeiouy]", "").length()); }
		 */

		/*
		 * String[] arr =
		 * {"daddy","mommy","brother","daddy","future","cleaner","daddy"};
		 * 
		 * HashSet<String> hs =new HashSet<String>(); boolean flag = false; for(String
		 * d:arr) {
		 * 
		 * if(hs.add(d)==false) { System.out.println("found the duplicate value :"+d);
		 * flag=true; }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * if(flag==false) {
		 * 
		 * System.out.println("there is no duplicate values found"); }
		 */
		
		
		int[] arr= {10,20,30,40,50,60,70,80,90};
		
		int elementSearch=50;
		
		boolean flag=false;
		
		/*
		 * for(int a:arr) {
		 * 
		 * if(elementSearch==a) { System.out.println("element found the value : "+a);
		 * flag=true; } }
		 * 
		 * if(flag==false) { System.out.println("element not found still"); }
		 */
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(elementSearch==arr[i]) {
				
				System.out.println("element found at this position : "+i+" -> and the value is : "+arr[i] );
				flag = true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("still the element is not found working on it");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
