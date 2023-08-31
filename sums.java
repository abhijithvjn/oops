import java.util.Scanner;
class arry
{
int i=0,sum=0;
int[] a;
void readarray()
{
a=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements:");
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
}
void sumarray()
{
System.out.println("The sum of the elements are:");
for(int i=0;i<5;i++)
{
sum=sum+a[i];
}
System.out.print(sum);
}
void printarray()
{
System.out.println("Array elements are:");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
public static void main(String[] args)
{
arry obj=new arry();
obj.readarray();
obj.printarray();
obj.sumarray();
}
}