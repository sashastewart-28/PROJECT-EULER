//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?
//EULER PROJECT 07
public class Prime10001 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int ck=0;
		long i=1;
		while(ck < 10001)
		{
			i++;
			if(isPrime(i))
			{
				ck++;
			}
		}
		System.out.println("10001st prime = "+i);

	}
	public static boolean isPrime(long i)
	{
		if(i<2)
			return false;
		else if(i == 2)
			return true;
		for(int j=2;j<Math.pow(i, 0.5)+1;j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
		
	}

}

