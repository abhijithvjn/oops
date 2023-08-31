import java.util.Scanner;
public class calc
{
public static void main(String[] args)
{
int a=10,b=5,n;
Scanner reader=new Scanner(System.in);
System.out.println("Enter option number:");
System.out.println("1.ADDITION 2.SUBTRACTION 3.MULTIPLICATION 4.DIVISION");
n=reader.nextInt();
switch(n)
{
	case 1:
	int add=a+b;
	System.out.println("ADDITION OF A+B:" + add);
	break;
	case 2:
	int sub=a-b;
	System.out.println("SUBTRACTION OF A-B:" + sub);
	break;
	case 3:
	int mul=a*b;
	System.out.println("MULTIPLICATION OF A*B:" + mul);
	break;
	case 4:
	int div=a/b;
	System.out.println("DIVISION OF A/B:" + div);
	break;
	default:
		System.out.println("ERROR");
}
}
}