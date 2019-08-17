import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int n,k;
		int expo=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		k=in.nextInt();
		for(int i=1;i<=k;i++)
		{
		   expo =expo*n;  
		   
		}
	   System.out.println(+expo);	
		
	}
}
