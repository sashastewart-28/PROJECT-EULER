//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
//EULER PROJECT 09
public class pythagoreantriplets 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,a,b,c;
		int sq=(int)Math.sqrt(1000);
		for(i=0;i<=sq;i++)
		{
			for(j=i+1;j<=sq;j++)
			{
				a=(i*i)-(j*j);
				b=2*i*j;
				c=(i*i)+(j*j);
				if(a+b+c == 1000)
				{
					System.out.println("product is = "+(a*b*c));
				}
			}
		}
	}
}
