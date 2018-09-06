//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?
//EULER PROJECT 07
public class prime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=1,c,j=1,ck=0;
		while(true)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			{
				ck++;
			}
			i++;
			if(ck==10001)
				break;
		}
		System.out.println("10001st prime = "+i);

	}

}
