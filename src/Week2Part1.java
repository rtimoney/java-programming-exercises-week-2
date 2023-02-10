/**
 * @author Ronan J Timoney
 * Main method for Part1 for Practical 2
 */
public class Week2Part1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner s= new Scanner (System.in);
		String input;
		input ="Ronan Timoney";

		System.out.println("The input String : " + input);
		System.out.println("The number of Characters : "+input.length());
		System.out.printf("The first character of the string is : %s and the secong is : %s%n", input.charAt(0), input.charAt(1));
		
		System.out.println("The first character in the string is " + input.charAt(0)
		+ " and the second character in the string is : " + input.charAt(1));
		
		
		System.out.println("The string in uppercase : "+input.toUpperCase());
		
		// 
		
		System.out.println("The string with fada added is : " + input.replace('o','ó'));		
	} // end of main method
} // end of class
