import java.util.*;

abstract class Publisher 
{

    abstract void PublisherDetails(Scanner read);

}

class Book extends Publisher 
{
    String Title, Author, pname, pdate;

    void PublisherDetails(Scanner read) 
    {
        System.out.print("Enter the name of publisher : ");
        pname = read.nextLine();

        System.out.print("Enter the published date : ");
        pdate = read.nextLine();
    }

    Book(Scanner read)
     {
        System.out.print("\nEnter the Title of book : ");
        Title = read.nextLine();

        System.out.print("Enter the Author name : ");
        Author = read.nextLine();
    }
}

class Literature extends Book
 {

    String Category = "Literature";

    Literature(Scanner read)
     {
        super(read);

        PublisherDetails(read);
    }

    void display() 
    {
        System.out.println("\tPublisher name: " + pname);

        System.out.println("\t\t\tPublished date: " + pdate);

        System.out.println("\t\t\tBook title: " + Title);

        System.out.println("\t\t\tAuther: " + Author);

        System.out.println("\t\t\tCategory: " + Category);
    }
}

class Fiction extends Book 
{
    String Category = "Fiction";

    Fiction(Scanner read) 
    {
        super(read);
        PublisherDetails(read);
    }

    void display() 
    {
        System.out.println("\tPublisher name: " + pname);

        System.out.println("\t\t\tPublished date: " + pdate);

        System.out.println("\t\t\tBook title: " + Title);

        System.out.println("\t\t\tAuther: " + Author);

        System.out.println("\t\t\tCategory: " + Category);
    }

}

public class BookDetails 
{
    public static void main(String[] args)
     {
        int flimit,llimit,i;

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of Fiction books you want to insert: ");
        flimit = read.nextInt();
        read.nextLine();

        Fiction[] f = new Fiction[flimit];

        for (i = 0; i < flimit; i++) 
        {
            f[i] = new Fiction(read);
        }
        System.out.print("\nEnter the number of Literature books you want to insert: ");
        llimit = read.nextInt();    
        read.nextLine();

        Literature[] l = new Literature[llimit];
        for (i = 0; i < llimit; i++)
        {
            l[i] = new Literature(read);
        }
        System.out.println("\n\t\t\tDetails of Literatures");

        System.out.println("\t\t__________________________________");

        for(i=0;i<l.length;i++)
        {
            System.out.print("\n\tBook "+(i+1)+" ->");
            l[i].display();
        }
        System.out.println("\t\t__________________________________");

        System.out.println("\n\t\t\tDetails of Fiction");

        System.out.println("\t\t__________________________________");

        for(i=0;i<f.length;i++)
        {
            System.out.print("\n\tBook "+(i+1)+" ->");
            f[i].display();
        }
    }
}