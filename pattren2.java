package Pattrens;

import java.util.Scanner;

public class pattren2 {
	public static void main(String argd[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		char c='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(c);
				//c++;
			}
			System.out.println();
			c++;
		}
	}

}
