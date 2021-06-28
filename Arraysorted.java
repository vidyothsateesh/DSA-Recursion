import java.util.*;
public class Arraysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		checksorted(arr,n);

	}

	private static void checksorted(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==1 ||n==0)
		{
			System.out.println("True");
			return;
			
		}
		if(arr[n-1]<arr[n-2])
		{
			System.out.println("False");
			return;
		}
			
			
		checksorted(arr,n-1);
		
	}

}
