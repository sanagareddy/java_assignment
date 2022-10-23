package example;

public class Test {

	public static void main(String[] args) {
		int i,j;
		int n = 9;
		for(i=0;i<n;i++) 
		{
			for(j=0;j<n;j++) 
			{
				if(i==0 || j==n/2 || i==n-1)
				{
				  System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<n;j++) 
			{
				if(j==0 || j==n-1 || (i==n-2 && j==n-2) || (i==n-3 && j==n-3) || (i==n-4 && j==n-4) || (i==n-5 && j==n-5)
						|| (i==n-6 && j==n-6) || (i==n-7 && j==n-7) || (i==n-8 && j==n-8))
				{
				  System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<n;j++) 
			{
				if(j==0 || i==0 || i==n-1 || i== n/2)
				{
				  System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<n;j++) 
			{
				if((j==0 && i!=n-1) || (i==n-1 && j!=0 && j!=n-1)||(j==n-1 && i!=n-1))
				{
				  System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<n;j++) 
			{
				if(j==0 || i==0 || (j==n-1 && i<=n/2) || i==(n-1)/2 || (i==n-4 && j==n-7) || (i==n-3 && j==n-6)|| (i==n-2 && j==n-5)|| (i==n-1 && j==n-4))
				{
				  System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<n;j++) 
			{
				if((i==0 && j!=0 && j!=n-1) ||(i==n-1 && j!=0 && j!=n-1) || (j==0 && i!=0 && i!=n-1)|| (j==n-1 && i!=0 && i!=n-1) )
				{
				  System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<n;j++) 
			{
				if(j==0 || j==n-1 || (i==n-2 && j==n-2) || (i==n-3 && j==n-3) || (i==n-4 && j==n-4) || (i==n-5 && j==n-5)
						|| (i==n-6 && j==n-6) || (i==n-7 && j==n-7) || (i==n-8 && j==n-8))
				{
				  System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
