import java.util.Scanner;
class symmetric
{
	int i,j,row,col;
	int[][] matrix1;
	void readarray()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows:");
	row=sc.nextInt();
	System.out.println("Enter the no of columns:");
	col=sc.nextInt();
	matrix1 = new int[row][col];
	System.out.println("Enter the elements of 1st array");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			matrix1[i][j]=sc.nextInt();
		}
	}
	}
	void printarray()
	{	
	System.out.println("Printing Matrix without transpose:");  
	for(int i=0;i<row;i++)
	{    
		for(int j=0;j<col;j++)
		{    
				System.out.print(matrix1[i][j]+" ");    
		}    
		System.out.println();//new line    
	}    
	System.out.println("Printing Matrix After Transpose:");  
	for(int i=0;i<row;i++)
	{    
		for(int j=0;j<col;j++)
		{    
			System.out.print(matrix1[j][i]+" ");    
		}    
	System.out.println();//new line    
	}    
	}
	public static void main(String[] args)
	{
		symmetric obj=new symmetric();
		obj.readarray();
		obj.printarray();
	}
}