package hello;

import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50;
		int[]primes = new int[num];
		primes[0]=2;
		int cnt = 1;
		MAXLOOP:
		for(int x=3;cnt<50;x++)
		{
			for(int i=0;i<cnt;i++)
			{
				if(x%primes[i]==0)
					continue MAXLOOP;
			}
			primes[cnt++] = x;
		}
		for(int k:primes)
		{
			System.out.println(k+" ");
		}
		System.out.println("那就随便改改咯.");
//		ArrayList<String>a = new ArrayList<String>();
//		a.add("first");
//		a.add("second");
//		for(String s:a)
//		{
//			System.out.println(s);
//		}
	}

}
