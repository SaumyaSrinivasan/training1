import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int num,m,flag=0;
		int i;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		m=num/2;
		if(num==0||num==1)
		{
		    System.out.println("no");
		}
		else
		{
		    for(i=2;i<=m;i++)
		    {
		        if(num%i==0)
		        {
		            System.out.println("no");
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println("yes");
		    }
		}
	}
}
