import java.util.*;
public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		printsubsets(arr,0,n," ");

	}

	private static void printsubsets(int[] arr, int i, int n, String string) {
		// TODO Auto-generated method stub
		if(i==n)
		{
			System.out.println(string);
			return;
		}
		printsubsets(arr,i+1,n,string+String.valueOf(arr[i])+",");
		printsubsets(arr,i+1,n,string);
	}

}
