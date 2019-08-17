import java.util.*;
public class Program
{
    public static int largenum(int a[],int total)
    {
        int temp;
		for(int i=0;i<total;i++)
		{
		    for(int j=i+1;j<total;j++)
		    {
		        if(a[i]>a[j])
		        {
		            temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		}
		return a[total-1];
    }
	public static void main(String[] args) {
		
		int a[]=new int[3];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		    a[i]=in.nextInt();
		}
		
		System.out.println(+largenum(a,3));
		
		
	}
}
