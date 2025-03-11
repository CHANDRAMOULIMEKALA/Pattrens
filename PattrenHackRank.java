package Pattrens;

import java.util.Scanner;

public class PattrenHackRank {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1;
//		int p=n+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k>=i)
				System.out.print(k);
			}
			
			for(int l=2;l<=i;l++)
			{
				
				System.out.print(i+3);
				break;
			}
			for(int m=3;m<=i;m++)
			{
				System.out.print(i+5);
				break;
			}
			for(int o=4;o<=i;o++)
			{
				System.out.print(i+6);
				break;
			}
			System.out.println();
		}
	}

}
