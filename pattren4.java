package Pattrens_dss;

public class pattren4 {

	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=10;k>i;k--)//for(int k=0;k<10-i;k++)
			{
				System.out.print("*"+" ");
			}
		System.out.println();
		}

	}

}
