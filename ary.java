import java.util.Scanner;
class ary
{
int i=0;
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
ary obj=new ary();
obj.readarray();
obj.printarray();
}
}