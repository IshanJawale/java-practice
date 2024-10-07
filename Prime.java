/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Prime
{
	public static void main(String[] args) {
		int n=100;
	
		int isPrime=1;
		for(int i=1;i<n;i++){
			isPrime=1;
			for(int j=2;j<i;j++){
				if(i%j!=0){
					continue;
				}
				isPrime=0;
			}
		   if(isPrime==1){
			   System.out.println(i);
		   }
		}
	}
}
