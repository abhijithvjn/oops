import java.util.Scanner;
public class Teacher extends Employee {
String department;
String subjectsTaught;
Teacher(int empid, String name, double salary, String address, String department, String
subjectsTaught) {
super(empid, name, salary, address);
this.department = department;
this.subjectsTaught = subjectsTaught;
}
public void display() {
System.out.println("Employee ID: " + empid);
System.out.println("Name: " + name);
System.out.println("Salary: " + salary);
System.out.println("Address: " + address);
System.out.println("Department: " + department);
System.out.println("Subjects Taught: " + subjectsTaught);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the no of teachers : ");
int n = sc.nextInt();
Teacher[] teachers = new Teacher[n];
for (int i = 0; i < n; i++) {
System.out.println("Enter details for Teacher " + (i + 1) + ":");
System.out.print("Employee ID: ");
int empId = sc.nextInt();
System.out.print("Name: ");
String name = sc.next();
System.out.print("Address: ");
String address = sc.next();
System.out.print("Salary: ");
double salary = sc.nextDouble();
System.out.print("Subject: ");
String subject = sc.next();
System.out.print("Department: ");
String department = sc.next();
teachers[i] = new Teacher(empId, name, salary, address, department, subject);
}
sc.close();
for (Teacher teacher : teachers) {
teacher.display();
System.out.println();
}
}
}
class Employee {
int empid;
String name;
double salary;
String address;
Employee(int empid, String name, double salary, String address) {
this.empid = empid;
this.name = name;
this.salary = salary;
this.address = address;
}
}
