package Pattrens;

import java.util.Scanner;

public class pattren3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
