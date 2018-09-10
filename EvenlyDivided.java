//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//EULER PROJECT 05
public class EvenlyDivided 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int m=20;
		while(div(m))
		{
			m++;
		}
		System.out.println("ans="+m);

	}
	public static boolean div(int n)
	{
		for(int i=1;i<20;i++)
		{
			if(n%i!=0)
			{
				return true;
			}
		}
		return false;
	}

}
