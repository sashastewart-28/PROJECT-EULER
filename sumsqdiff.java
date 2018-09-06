//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
//EULER PROJECT 06
public class sumsqdiff 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,ssq=0,sqs=0,s=0;
		for(i=1;i<=100;i++)
		{
			ssq+=(i*i);
			s+=i;
		}
		sqs=(s*s);
		System.out.println("difference = "+(sqs-ssq));

	}

}
