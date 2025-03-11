package Pattrens;

import java.util.Scanner;

public class pattren1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit:");
	int n=sc.nextInt();
	char c=64;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			//char k=char(;
			System.out.print((char)(c+j)+" ");
			//c++;
		}
		System.out.println();
		//c++;
	}
	}
	
	}

