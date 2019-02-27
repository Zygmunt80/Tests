package stringToInt;

public class StringToInt {
	public static void main(String args[]) {
//Declaring String variable  
		String s1 = "21453.524";
		String s2 = "554.45";
//Converting String into int using Integer.parseInt()  
		float i1 = Float.parseFloat(s1);
		float i2 = Float.parseFloat(s2);
//Printing value of i  
		System.out.println(i1 + i2);
	}
}