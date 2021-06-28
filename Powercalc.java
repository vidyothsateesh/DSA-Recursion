import java.util.Scanner;

public class Powercalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int p=findpower(a,b);
		System.out.println(p);

	}

	private static int findpower(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0)
			return 1;
		if(b==1)
			return a;
		int temp=findpower(a,b/2);
		if(b%2==0)
			return temp*temp;
		else
			return a*temp*temp;
	
	}

}
