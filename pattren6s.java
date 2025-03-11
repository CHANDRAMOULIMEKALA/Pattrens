package Pattrens_dss;

public class pattren6s {

	public static void main(String[] args)
	{
		for(int i=0;i<20;i++)
		{
			if(i<5)
			{
				for(int j=0;j<5-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<2*i+1;k++)
				{
					System.out.print("*");
				}
			}
			else if(i<5 || i<10)
			{
				//System.out.print("b");
				for(int j=0;j<10-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<(2*i+1)-10;k++)
				{
					System.out.print("*");
				}
			}
			else if(i<10 || i<15)
			{
				//System.out.print("c");
				for(int j=0;j<15-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<(2*i+1)-20;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				//System.out.print("d");
				for(int j=0;j<4;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<3;k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
