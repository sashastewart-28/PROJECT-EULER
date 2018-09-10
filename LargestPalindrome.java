//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
//EULER PROJECT 04
public class LargestPalindrome 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,p,max=0,dup=0,d=0,rev=0;
		for(i=999;i>=100;i--)
		{
			for(j=i;j>=100;j--)
			{
				p=i*j;
				dup=p;
				rev=0;
				while(dup>0)
				{
					d=dup%10;
					rev=rev*10+d;
					dup/=10;
				}
				if(rev==p && p>max)
				{
					max=p;
				}
			}
		}
		System.out.println("largest palindrome = "+max);

	}

}
