import java.util.Scanner;
class student
{
    String stud;
    int rollno;
    String dep;
    Scanner sc = new Scanner(System.in);
    void collect(){
        System.out.println("Enter your name");
        stud=sc.nextLine();
        System.out.println("Enetr your roll no");
        rollno=sc.nextInt();
        System.out.println("Enter your department");
        dep=sc.nextLine();
    }
    void display(){
        System.out.println("Student Information");
        System.out.println("Student Name:"+stud);
        System.out.println("student rollno:RA"+rollno);
        System.out.println("Student department:"+dep);
    }
    }