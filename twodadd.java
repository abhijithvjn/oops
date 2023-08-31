import java.util.Scanner;
class twodadd
{
	public static void main(String[] args)
	{
		System.out.println("enter the row of matrix");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println("enter the coloumn of matrix");
		int c=sc.nextInt();
		System.out.println("enter the elements of first array");
		int [][] a =new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements of second array");
		int [][] b =new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	
		int [][] d =new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=a[i][j]+b[i][j];
			}
		}
	
		System.out.println("sum of matrix is ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}