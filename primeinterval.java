import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int num1,num2;
		Scanner in=new Scanner(System.in);
		num1=in.nextInt();
		num2=in.nextInt();
		while(num1<num2)
		{
		    boolean flag=false;
		    for(int i=2;i<=num1/2;i++)
		    {
		        if(num1%i==0)
		        {
		            flag=true;
		            break;
		        }
		        
		    }
		    if(!flag)
		    {
		        System.out.print(num1+" ");
		       
		    }
		    ++num1;
		}
	}
}
