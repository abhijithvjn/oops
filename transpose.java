import java.util.Scanner;
class tranpose
{
public static void main(String[] args)
	{ 
		int i,j;
		boolean symmetric = true;
		System.out.println("enter the row of matrix");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println("enter the coloumn of matrix");
		int c=sc.nextInt();
		System.out.println("enter the elements");
		int [][] a =new int[r][c];
		
		for(i=0;i<r;i++)
		{
			for( j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		if ( r != c )
		{
			System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
		}
		else
		{
			
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if (a[i][j] != a[j][i] )
				{
				symmetric = false;
				break;
				}
				
			}
		}	
		}
		
		if ( symmetric)
		{
			System.out.println("The given matrix is symmetric.");
		}
		else
		{
			System.out.println("The given matrix is not symmetric.");
		}

		sc.close();
		}
	
}