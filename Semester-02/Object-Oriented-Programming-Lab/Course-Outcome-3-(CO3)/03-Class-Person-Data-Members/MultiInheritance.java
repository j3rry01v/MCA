import java.util.*;

class Person
{
    String Name,Gender,Address;

    int Age;

    Person(String Name,String Gender, String Address,int Age)
    {
        this.Name = Name;

        this.Gender = Gender;

        this.Address = Address;

        this.Age = Age;
    }
}

class Employee extends Person
{
    String Empid,CompanyName,Qualification;

    Double Salary;

    Employee(String Empid,String CompanyName, String Qualification,Double salary,String Name,String Gender, String Address,int Age)
    {
        super(Name,Gender,Address,Age);

        this.Empid = Empid;

        this.CompanyName=CompanyName;

        this.Qualification=Qualification;
    }
}

class Teacher extends Employee
{

    String Subject,Department,TeacherId;

    Teacher(String Subject, String Department, String TeacherId,String Empid,String CompanyName, String Qualification,Double salary,String Name,String Gender, String Address,int Age)
    {
        super(Empid,CompanyName,Qualification,salary,Name,Gender,Address,Age);

        this.Subject=Subject;

        this.Department=Department;

        this.TeacherId=TeacherId;
    }

    void display()
    {
        System.out.println("\t\t\tName of Employee : "+ Name);

        System.out.println("\t\t\tGender : "+ Gender);

        System.out.println("\t\t\tAddress : "+ Address);

        System.out.println("\t\t\tAge : "+ Age);

        System.out.println("\t\t\tEmployee id : "+ Empid);

        System.out.println("\t\t\tCompany Name : "+ CompanyName);

        System.out.println("\t\t\tQualification : "+ Qualification);

        System.out.println("\t\t\tEmployee Salary : "+ Salary);

        System.out.println("\t\t\tTeacher Id : "+ TeacherId);

        System.out.println("\t\t\tDepartment : "+ Department);

        System.out.println("\t\t\tSubject Tought : "+ Subject);

        System.out.println("\t\t___________________________________\n");
    }
}

public class MultiInheritance
 {
    static Teacher[] insertDetails(Scanner read)
    {
        int limit,age;

        String Eid,name, Add,Dept,sub,cname,gender,ql,Tid;

        Double salary;

        System.out.print("Enter the no of Teachers :");

        limit=read.nextInt();

        Teacher[] t = new Teacher[limit];

        for(int i=0; i<limit; i++)
        {
            System.out.print("\n\n______________________________\n\nEnter the Details of Teacher "+(i+1)+"\n______________________________\n\n");

            System.out.print("Enter the Name : ");
            name = read.next();

            System.out.print("\nEnter the Gender : ");
            gender = read.next();

            System.out.print("\nEnter the Address : ");
            Add = read.next();

            System.out.print("\nEnter the Age : ");
            age = read.nextInt();

            System.out.print("\nEnter the Employee Id : ");
            Eid = read.next();

            System.out.print("\nEnter the Company Name : ");
            cname = read.next();

            System.out.print("\nEnter the Qualification : ");
            ql = read.next();

            System.out.print("\nEnter the Salary : ");
            salary = read.nextDouble();

            System.out.print("\nEnter the Department : ");
            Dept = read.next();

            System.out.print("\nEnter the Subject taught by the teacher : ");
            sub = read.next();

            System.out.print("\nEnter the Teacher Id : ");
            Tid = read.next();

            t[i] = new Teacher(sub,Dept,Tid,Eid,cname,ql,salary,name,gender,Add,age);
        }

        return t;
    }
    static void displayDetails(Teacher[] t)
    {
        for(int i=0;i<t.length;i++)
        {
            System.out.println("\n\t\t\tDetails of a Teacher "+(i+1));

            System.out.println("\t\t___________________________________\n");

            t[i].display();
        }
    }
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);

        Teacher[] t=insertDetails(read);

        displayDetails(t);
    }
}

