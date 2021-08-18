import java.util.*;

class Employee
 {
    String Empid, Name, Address;

    Double Salary;

    Employee(String Empid, String Name, String Address, Double Salary) 
    {
        this.Empid = Empid;

        this.Name = Name;

        this.Address = Address;

        this.Salary = Salary;
    }
}

class Teacher extends Employee 
{
    String Department;

    String[] Subjects;

    Teacher(String Department, String[] Subjects, String Empid, String Name, String Address, Double Salary) 
    {
        super(Empid, Name, Address, Salary);

        this.Department = Department;

        this.Subjects = Subjects;
    }

    void display()
     {
        System.out.println("\n\tEmployee id : " + Empid);

        System.out.println("\n\tEmployee Name : " + Name);

        System.out.println("\n\tEmployee Address : " + Address);

        System.out.println("\n\tEmployee Salary : " + Salary);

        System.out.println("\n\tDepartment : " + Department);

        System.out.print("\n\tSubjects Tought : " + Subjects[0]);

        for (int i = 1; i < Subjects.length; i++)
        {
            System.out.print(", " + Subjects[i]);
        }
        System.out.println("\n\t______________________\n");
    }
}

public class TeacherDetails
 {
    static Teacher[] insertDetails(Scanner read) 
    {
        int limit, num;

        String[] sub;

        String Eid, name, Add, Dept;

        Double salary;

        System.out.print("Enter the no of Teachers :");

        limit = read.nextInt();

        Teacher[] t = new Teacher[limit];

        for (int i = 0; i < limit; i++) 
        {
            System.out.print("\nEnter the Employee Id : ");

            Eid = read.next();

            System.out.print("Enter the Employee Name : ");

            name = read.next();

            System.out.print("Enter the Employee Address : ");

            Add = read.next();

            System.out.print("Enter the Salary : ");

            salary = read.nextDouble();

            System.out.print("Enter the Department : ");

            Dept = read.next();

            System.out.print("Enter the Number of Subjects taught by the teacher : ");

            num = read.nextInt();

            sub = new String[num];

            System.out.print("Enter the Subjects taught by the teacher : ");

            for (int j = 0; j < num; j++)
            {
                sub[j] = read.next();
            }

            t[i] = new Teacher(Dept, sub, Eid, name, Add, salary);
        }

        return t;
    }

    static void displayDetails(Teacher[] t) 
    {
        for (int i = 0; i < t.length; i++)
         {
            System.out.println("\n\tDetails of a Teacher");
            System.out.println("\n\t______________________\n");
            t[i].display();
        }
    }

    public static void main(String args[])
     {
        Scanner read = new Scanner(System.in);
        Teacher[] t = insertDetails(read);
        displayDetails(t);
    }
}