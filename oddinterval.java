import java.util.*;
public class Program
{
	public static void main(String[] args) {
		
		int start,end;
		Scanner in=new Scanner(System.in);
		start=in.nextInt();
		end=in.nextInt();
		for(int i=start+1;i<end;i++)
		{
		    if(i%2!=0)
		    {
		        System.out.print(i+" ");
		    }
		}
		
	}
}
