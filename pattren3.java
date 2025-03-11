package Pattrens_dss;

public class pattren3 {

	public static void main(String[] args)
	{
		for(int i=0;i<20;i++)
		{
			if(i<10)
			{
				for(int j=0;j<10-i;j++)
				{
					System.out.print(" "+"");
				}
				for(int k=0;k<i;k++)
				{
					System.out.print("*"+"");
				}
			}
			else
			{
				for(int j=0;j<i-10;j++)
				{
					System.out.print(" "+"");
				}
				for(int k=0;k<20-i;k++)
				{
					System.out.print("*"+"");
				}
			}
		System.out.println();
		}

	}

}
