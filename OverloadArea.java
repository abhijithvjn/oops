class area
{
public static void main(String args[]) 
{
OverloadArea o = new OverloadArea();
o.area(5);
o.area(3,14);
o.area(10.0);
}
}
class OverloadArea
{
	void area(int a)
	{
		System.out.println("the area of square is"+ Math.pow(a,2) +"sq.units");
	}
	void area(float a,float b)
	{
		System.out.println("the area of rectangle is" +a*b+"sq.units");
	}
	void area(double a)
	{
		double z =3.14 * a * a;
		System.out.println("the area of the circle is "+z);
	}
}