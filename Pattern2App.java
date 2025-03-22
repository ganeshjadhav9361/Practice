import java.util.*;
public class Pattern2App
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number= ");
		int n=sc.nextInt();
		
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}