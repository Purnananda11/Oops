
class Teacher{
    String teacherName;
    String subject;
    double salary;
    int salaryy;
    void display(String teacherName, String subject, int salaryy)
    {
        this.teacherName = teacherName;
        this.subject = subject;
        System.out.println("Teacher name is "+teacherName+" and his subject is "+subject);
    }
    void display(String teacherName, String subject, double salary)
    {
       this.teacherName = teacherName;
       this.subject = subject;
       this.salary = salary;
        System.out.println("Teacher name is "+teacherName+" and his subject is "+subject+" "+" his salary is "+salary);
    }

}
public class Polymorphism {
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher();
        teacher.display("Ajay","Maths", 100000);
        teacher.display("Ajay", "Maths", 1000.00);
    }
}
//here we are using concept of method overloading. we are overloading same
// method with different number of parameters. we are also overload the method with
// same number if parameter by changing return of method and type of parameter

