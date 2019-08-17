import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int num;
		int count=0;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		while(num !=0)
		{
		    num/=10;
		    count++;
		}
		System.out.println(+count);
	}
}
