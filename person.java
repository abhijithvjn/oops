public class person
{
String name;
int age;
String sex;
String height;
String weight;
public void display()
{
System.out.println(name);
System.out.println(age);
System.out.println(sex);
System.out.println(height);
System.out.println(weight);
}
public static void main(String[] args)
{
person one = new person();
one.name="Jackie Chan";
one.age=53;
one.height="5.9";
one.weight="52 kg";
one.display();
}

}
