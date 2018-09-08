//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?
//EULER PROJECT 07
public class prime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=1,c,j=1,ck=0;
		while(ck<=10001)
		{
			if(isPrime(i))
			{
				ck++;
			}
			i+=2;
		}
		System.out.println("10001st prime = "+(i-2));

	}
	public static boolean isPrime(int i)
	{
		double n;
		int f;
		if(i == 1)
			return false;
		else if(i < 4)
			return true;
		else if(i%2 == 0)
			return false;
		else if(i < 9)
			return true;
		else if(i%3 == 0)
			return false;
		else
		{
			n = Math.floor(Math.sqrt(i));
			f = 5;
			while(f <= n)
			{
				if(i%f == 0)
				{
					return false;
				}
				if(n%(f+2) == 0)
				{
					return false;
				}
				f = f+6;
			}
			return true;
		}
	}

}
