import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int n,k;
		int sum=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		k=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int i=0;i<k;i++)
		{
		    sum+=a[i];
		}
		System.out.println(+sum);
	}
}
