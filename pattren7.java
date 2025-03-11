package Pattrens_dss;

public class pattren7 {

	public static void main(String[] args)
	{
		for(int rows=0;rows<19;rows++)
		{
			if(rows <10)
			{
				for(int spaces=0;spaces<9-rows;spaces++)
				{
					System.out.print(" ");
				}
				for(int stars=0;stars<=rows;stars++)
				{
					System.out.print("*"+" ");
				}
			}
			else
			{
				for(int spaces=0;spaces<=rows-10;spaces++)
				{
					System.out.print(" ");
				}
				for(int stars=0;stars<19-rows;stars++)
				{
					System.out.print("*"+" ");
				}
			}
		System.out.println();
		}

	}

}
