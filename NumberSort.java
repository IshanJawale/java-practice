import java.util.*;
public class NumberSort
{
	public static void main(String[] args) {
		int n=5;
		int num[]=new int[n];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		for(int i=0;i<n;i++){
		  num[i]=s.nextInt();
		}
	    int temp;
		for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(num[i]>num[j]){
	                temp=num[i];
	                num[i]=num[j];
	                num[j]=temp;
	            }
	        }
		}
		System.out.println("Sorted Numbers: ");
		for(int i=0;i<n;i++){
		  System.out.println(num[i]+" ");
		}
	}
}
