import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int r,temp,sum=0;
		int num;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		temp=num;
		while(num>0)
		{
		    r=num%10;
		    sum=(sum*10)+r;
		    num=num/10;
		}
		if(temp==sum)
		{
		    System.out.println("yes");
		    
		}
		else
		{
		    System.out.println("no");
		}
	}
}
