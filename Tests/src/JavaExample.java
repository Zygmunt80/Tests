
public class JavaExample{

	// Java program to demonstrate working of split() 
	// using regular expressions 
 
		public static void main(String args[]) 
		{ 
			String str = "word1, word2 word3@word4?word5.word6+word7logword8"; 
			String[] arrOfStr = str.split("[, ?.@+]+"); 

			for (String a : arrOfStr) 
				System.out.println(a); 
		} 
	} 
