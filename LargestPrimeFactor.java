//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
//EULER PROJECT 03
public class LargestPrimeFactor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 long  n= 600851475143L,m=0;
		 for(long i=3;i*i<n;i+=2)
		 {
			 if(n%i == 0 && prime(i))
			 {
				 if(i>m)
					 m=i;
			 }
		 }
		 System.out.println("largest prime factor="+m);
	}
	public static boolean prime(long n)
	{
		if(n%2 == 0)
		{
			return false;
		}
		for(long i=3;i*i<n;i+=2)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
