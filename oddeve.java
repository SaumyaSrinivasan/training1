import java.util.*;
public class Program

{
	public static void main(String[] args) {
	    int num;
	    Scanner in=new Scanner(System.in);
	    num=in.nextInt();
	    if(num>0)
	    {
	         if(num%2== 0)
	        {
	             System.out.println("Even");
	        
	         }
	        else 
	        {
	             System.out.println("Odd ");
	         
	         }
	    }
	     else 
	    {
	        System.out.println("Invalid ");
	        
	    }
	}
}
