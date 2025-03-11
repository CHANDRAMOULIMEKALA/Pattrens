package Pattrens;

import java.util.Scanner;

public class patteren5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}

	}

