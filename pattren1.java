package Pattrens_dss;

public class pattren1 {

	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			if(i<5)
			{
				for(int j=0;j<5-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<2*i;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int j=0;j<i-5;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<20-2*i;k++)
				{
					System.out.print("*");
				}
			}
		System.out.println();
		}

	}

}
