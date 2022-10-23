package example;

public class Test {

	public static void main(String[] args) {
		int i,j;
		int n=14;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1 || (i==n-13 && j!=(n-1)/2)|| (i==n-12 && j!=(n-1)/2 && j!=n-7 && j!=n-9 ) 
						|| (i==n-11 && j!=(n-1)/2 && j!=n-7 && j!=n-9 && j!=n-10 && j!=n-6)
						|| (i==n-10 && j!=(n-1)/2 && j!=n-7 && j!=n-9 && j!=n-10 && j!=n-6 && j!=n-11 && j!=n-5)
						|| (i==n-9 && j!=(n-1)/2 && j!=n-7 && j!=n-9 && j!=n-10 && j!=n-6 && j!=n-11 && j!=n-5&& j!=n-4&& j!=n-12)
						|| (i==n-8 && j!=(n-1)/2 && j!=n-7 && j!=n-9 && j!=n-10 && j!=n-6 && j!=n-11 && j!=n-5&& j!=n-4&& j!=n-12&& j!=n-13 && j!=n-3)) 
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
