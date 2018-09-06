//Find the sum of all the primes below two million.
//EULER PROJECT 10
public class sumprime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,c;
		long s=0;
		for(i=1;i<2000000;i+=2)
		{
			c=0;
			for(j=1;j<i;j++)
			{
				if(j%i==0)
					c++;
			}
			if(c==2)
			{
				s+=i;
			}
		}
		System.out.println("sum = "+s);

	}

}
