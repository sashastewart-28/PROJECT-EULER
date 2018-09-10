//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
//EULER PROJECT 09
public class PythagoreanTriplets 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,c;
		for(i=1;i<1000/3;i++)
		{
			for(j=i;j<1000/2;j++)
			{
				c=1000-i-j;
				if((c*c)==((i*i)+(j*j)))
				{
					System.out.println("product is = "+(i*j*c));
				}
			}
		}
	}
}
