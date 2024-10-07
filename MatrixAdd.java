/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class MatrixAdd
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        int mat1[][],mat2[][],sum[][];
        int r,c;
        System.out.println("Rows: ");
        r=s.nextInt();
        System.out.println("Colums: ");
        c=s.nextInt();
        mat1=new int[r][c];
        mat2=new int[r][c];
        sum=new int[r][c];
        System.out.println("Enter Matrix 1: ");
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter Matrix 2: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat2[i][j]=s.nextInt();
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
	}
}
