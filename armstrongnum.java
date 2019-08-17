import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int num1,num2, r ,temp;
		Scanner in=new Scanner(System.in);
		num1=in.nextInt();
		num2=in.nextInt();
		
		for(int i=num1+1 ; i<num2 ;++i)
		{
		   temp=i;
		    int sum=0;
		    int counter=0;
		    while(temp!=0)
		    {
		        temp=temp/10;
		        ++counter;
		    }
		    temp=i;
		    while(temp!=0)
		    {
		         r=temp%10;
		         sum=sum+(r*r*r);
		         temp=temp/10;

		    }
		  if(i==sum)
		  {
	
		      System.out.print(i+" ");
		  }
		}
	}
}
