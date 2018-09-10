//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
//EULER PROJECT 01

public class Multiple35 
{

 	public static void main(String[] args) 
 	{
		// TODO Auto-generated method stub
 		int i=1,c=1,s=0;
 		while(c<1000)
 		{
 			if(i%3 == 0 || i%5 == 0)
 			{
 				s+=i;
 			}
 			i++;
 			c++;
 		}
 		System.out.println("sum = "+s);

	}

}
