/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the String: ");
    	String str;
    	str=s.nextLine();
    	int len=str.length();
    	String revStr="";
    	for(int i=0;i<len;i++){
    	    revStr+=str.charAt(len-i-1);
    	}
    	if(str.equals(revStr))
    	    System.out.println("Palindrome");
    	else
    	    System.out.println("Not Palindrome");
	}
}
