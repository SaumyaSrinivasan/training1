import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int num;
		int sum=0;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		for(int i=1;i<=num;i++)
		{
		    sum= sum+ i;
		}
		System.out.println(+sum);
		

	}
}
