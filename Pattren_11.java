package Pattrens_dss;

import java.util.Scanner;

public class Pattren_11 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
					System.out.print(" ");
				
				
			}
			for(int k=n;k>i;k--)
			{
					System.out.print("*");
				
				
			}
			System.out.println();
		}
	}

}
