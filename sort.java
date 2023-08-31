import java.util.Scanner;
public class sort
{
	public static void main(String[] args)
		{
			int n,i,j;
			String t;
			Scanner s=new Scanner(System.in);
			System.out.print("enter the number of names you want to enter");
			n=s.nextInt();
			String names[] =new String[n];
			Scanner s1=new Scanner(System.in);
			System.out.println("enter the all names");
			for(i=0;i<n;i++)
			{
				names[i]=s1.next();
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<i+1;j++)
				{
					if (names[i].compareTo(names[j])>0);
					{
						t=names[i];
						names[i]=names[j];
						names[j]=t;
					}
				}
			}
			System.out.println("namesin sorted order");
			for(i=0;i<n;i++)
			{
				System.out.println(names[i]);
			}
		}
	}