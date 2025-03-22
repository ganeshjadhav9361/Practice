import java.util.*;
public class PalinNumber
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number= ");
		int n=sc.nextInt();
		
		int z,rev=0;
		z=n;
		while(n!=0)
		{
			rev=(n%10)+(rev*10);
			n=n/10;
		}
		if(z==rev)
		{
			System.out.println("This is Palindrome Number");
		}
		else{
			System.out.println("This is not Palindrome Number");
		}
	}
}
