import java.util.*;
public class Name{
	
	public static void main(String[] args){
		System.out.println("enter 1 for odd : any other no  for even");
		Scanner sc=  new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("find nos till ?");
		int b = sc.nextInt();
		System.out.println("find nos from ?");
		int c = sc.nextInt();
		if(a==1){
		for(int i=c;i<=b;i++)
		{
			if (i%2==1)
			{System.out.print(i);}
		}
		
	    }
		else
		{
			for(int i=c;i<=b;i++)
		{
			if (i%2==0)
			{System.out.print(i);}
		}
		
		}
	
	
}
	
}