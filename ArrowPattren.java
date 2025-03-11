package Pattrens;

import java.util.Scanner;

public class ArrowPattren 
{
	void display(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("*");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=3;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		ArrowPattren ap=new ArrowPattren();
		System.out.println("Enter the size :");
		int n=s.nextInt();
		ap.display(n);
		
		
	}

}
