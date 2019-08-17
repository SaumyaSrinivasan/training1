import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int num,product;
		
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		for(int i=1;i<=5;i++)
		{
		    product=i*num;
		    System.out.print(" "+product);
		}
	}
}
