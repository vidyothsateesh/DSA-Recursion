import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printpattern(n,1);


	}

	private static void printpattern(int n, int i) {
		// TODO Auto-generated method stub
		int sum=n+1;
		if(n==0)
			return;
		if(i+n<=n)
		{
			System.out.print("*");
			printpattern(n,i+1);
		}
		else
			
			System.out.println();
			//printpattern(n-1,1);
		
		
	}
	

}
