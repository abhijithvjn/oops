public class stringman
{
public static void main(String[] args)
{
String s1="hello";
String s2="WELCOME";
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.length());
System.out.println(s1.toUpperCase());
System.out.println(s2.toLowerCase());
System.out.println(s1.concat(s2));
System.out.println(s1.compareTo(s2));
System.out.println(s1.substring(0,1));
System.out.println(s1.equals(s2));
System.out.println(s1.replace('o','a'));
System.out.println(s1+" "+s2);          
System.out.println(s1.charAt(3));
System.out.println(s2.split("E",2));
}
}