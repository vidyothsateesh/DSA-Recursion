import java.util.*;
public class Nonconscbin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();
		findbinary(K);
		

	}

	private static void findbinary(int K) {
		// TODO Auto-generated method stub
		
		if(K<=0)
			return;
		char [] ch=new char[K];
		ch[0]='0';
		generate(ch,K,1);
		ch[0]='1';
		generate(ch,K,1);

}

	private static void generate(char[] ch, int k, int i) {
		// TODO Auto-generated method stub
		if(i==k)
		{
			System.out.println(String.valueOf(ch));
			return;
		}
			
		if(ch[i-1]=='0')
		{
			ch[i]='0';
			generate(ch,k,i+1);
			ch[i]='1';
			generate(ch,k,i+1);
		}
			
		if(ch[i-1]=='1')
		{
			ch[i]='0';
			generate(ch,k,i+1);
		}
			
		
	}
	}
