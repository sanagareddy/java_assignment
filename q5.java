package example;

public class Test {

	public static void main(String[] args) {
		int i,j;
		int n=14;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || (j==1 && i!=(n-1)/2)|| (j==2 && i!=(n-1)/2&& i!=(n-3)/2&&i!=7) 
						|| (j==3 && i!=(n-1)/2)&& i!=(n-3)/2&& i!=(n-5)/2 &&i!=7&&i!=8
						|| (j==4 && i!=(n-1)/2)&& i!=(n-3)/2&& i!=(n-5)/2&& i!=(n-7)/2 &&i!=7&&i!=8&&i!=9
						|| (j==5 && i!=(n-1)/2)&& i!=(n-3)/2&& i!=(n-5)/2&& i!=(n-7)/2&& i!=(n-9)/2&&i!=7&&i!=8&&i!=9&&i!=10
						|| (j==6 && i!=(n-1)/2)&& i!=(n-3)/2&& i!=(n-5)/2&& i!=(n-7)/2&& i!=(n-9)/2&&i!=7&&i!=8&&i!=9&&i!=10&&i!=11)
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
