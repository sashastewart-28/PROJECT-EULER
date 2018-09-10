//Find the sum of all the primes below two million.
//EULER PROJECT 10
import java.math.*;
public class SumPrime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	    BigInteger sum= new BigInteger("2");
	    boolean prime=true;
	    long i,j;
	    for(i=3;i<2000000;i++)
	    {
	    	double a=Math.sqrt((double)i);
	    	for(j=2;j<=a;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			prime=false;
	    			break;
	    		}
	    	}
	    	if(prime)
	    	{
	    		sum=sum.add(BigInteger.valueOf(i));
	    	}
	    	prime=true;
	    }
	    System.out.println("sum="+sum);
	}
}
