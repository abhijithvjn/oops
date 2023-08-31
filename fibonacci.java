public class fibonacci
{
public static void main(String[] args)
{
int a,b,c,i;;
a=0;
b=1;
System.out.println(a);
System.out.println(b);
c=a+b;
System.out.println(c);
for(i=0;i<=5;i++)
{
a=b;
b=c;
c=a+b;
System.out.println(c);
}
}
}



