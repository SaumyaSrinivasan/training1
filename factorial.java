import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int num;
		int fact=1;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		for(int i=1;i<=num;i++)
		{
		    fact=fact*i;
		}
	   System.out.println(+fact);
	}
}
