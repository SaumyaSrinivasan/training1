import java.util.*;
public class Program
{
	public static void main(String[] args) {
		
		int year;
		boolean flag=false;
		Scanner in=new Scanner(System.in);
		year=in.nextInt();
		if(year%4==0)
		{
		    if(year % 100 == 0)
		    {
		        if(year%400 == 0)
		        {
		            flag=true;
		        }
		        else
		        {
		            flag=false;
		        }
		    }
		    else
		    {
		        flag=true;
		    }
		}
		else
		{
		    flag=false;
		}
	  if(flag)
	  {
	      System.out.println("yes");
	  }
	  
	  else
	  {
	      System.out.println("no");
	  }
	}
}
