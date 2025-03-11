package Pattrens;

import java.util.Scanner;

public class pattren10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		char c=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print(c+ " ");
				c++;
			}
			System.out.println();
		}
		
	}


	}

