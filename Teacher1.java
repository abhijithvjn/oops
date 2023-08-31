import java.util.Scanner;
class Teacher1 extends Employee 
{
	private String subject;
	private String department;
	private int teacherId;
	public Teacher1(String name, String gender, String address, int age, int empId, String companyName,String qualification, double salary, String subject, String department, int teacherId)
	{
		super(name, gender, address, age, empId, companyName, qualification, salary);
		this.subject = subject;
		this.department = department;
		this.teacherId = teacherId;
	}
	public void displayDetails() 
	{
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.println("Employee ID: " + empId);
		System.out.println("Company Name: " + companyName);
		System.out.println("Qualification: " + qualification);
		System.out.println("Salary: " + salary);
		System.out.println("Subject: " + subject);
		System.out.println("Department: " + department);
		System.out.println("Teacher ID: " + teacherId);
		System.out.println("-----------------------------");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of teachers: ");
		int numTeachers = sc.nextInt();
		Teacher1[] teachers = new Teacher1[numTeachers];
	for (int i = 0; i < numTeachers; i++) 
	{
		System.out.println("Enter details for Teacher " + (i + 1) + ":");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Gender: ");
		String gender = sc.next();
		System.out.print("Address: ");
		String address = sc.next();
		System.out.print("Age: ");
		int age = sc.nextInt();
		System.out.print("Employee ID: ");
		int empId = sc.nextInt();
		System.out.print("Company Name: ");
		String companyName = sc.next();
		System.out.print("Qualification: ");
		String qualification = sc.next();
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		System.out.print("Subject: ");
		String subject = sc.next();
		System.out.print("Department: ");
		String department = sc.next();
		System.out.print("Teacher ID: ");
		int teacherId = sc.nextInt();
		teachers[i] = new Teacher1(name, gender, address, age, empId, companyName,qualification,salary, subject, department, teacherId);
	}
	sc.close();
	System.out.println("Teacher Details:");
	System.out.println("-----------------------------");
	for (Teacher1 teacher : teachers)
	{
		teacher.displayDetails();
		System.out.println();
	}
	}
}
class Person
{
	String name;
	String gender;
	String address;
	int age;
	public Person(String name, String gender, String address, int age) 
	{
	this.name = name;
	this.gender = gender;
	this.address = address;
	this.age = age;
	}
}
class Employee extends Person 
{
	int empId;
	String companyName;
	String qualification;
	double salary;
	public Employee(String name, String gender, String address, int age, int empId, String companyName,String qualification, double salary) 
	{
		super(name, gender, address, age);
		this.empId = empId;
		this.companyName = companyName;
		this.qualification = qualification;
		this.salary = salary;
	}
}
