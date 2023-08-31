import java.util.Scanner;
class arraytwo
{
int i,j;
int [][]x;
arraytwo()
{
x=new int[][]{{11,22,33},{44,55,66}};
}
void printarray()
{
System.out.println("Elements in the given matrix:");
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
System.out.print(x[i][j]+"\t");
System.out.println("\n");
}
}
}
public static void main(String[] args)
{
arraytwo obj=new arraytwo();
obj.printarray();
}
}