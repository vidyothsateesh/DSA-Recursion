import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=findpersons(n);
		System.out.println(ans);

	}

	private static int findpersons(int n) {
		// TODO Auto-generated method stub
		if(n==1 ||n==2)
			return n;
		
		return findpersons(n-1) +(n-1)*findpersons(n-2);
	}
	

}
