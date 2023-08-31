import java.util.Scanner;
class twod
{
	public static void main(String[] args)
	{
		System.out.println("enter the row of matrix");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println("enter the coloumn of matrix");
		int c=sc.nextInt();
		System.out.println("enter the elements of array");
		int [][] a =new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	
		System.out.println("the array is");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}