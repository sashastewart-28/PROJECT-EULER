//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
//EULER PROJECT 09
public class pythagoreantriplets 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=0;i<998;i++)
		{
			for(j=0;j<i;j++)
			{
				for(k=0;k<j;k++)
				{
					if(((k*k)+(j*j)) == (i*i) && i+j+k == 1000)
					{
						System.out.println(i*j*k);
					}
				}
			}
		}

	}

}
