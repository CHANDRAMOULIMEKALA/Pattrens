package Pattrens_dss;

public class pattren9 {

	public static void main(String[] args)
	{
		for(int i=0;i<19;i++)
		{
			if(i<10)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*"+" ");
				}
			}
			else
			{
				for(int j=0;j<19-i;j++)
				{
					System.out.print("*"+" ");
				}
			}
		System.out.println();
		}
	}

}
