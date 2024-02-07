public class StaticExample {
    String firstName ;
    String lastName;
    static String school ;
    public void InstanceVar(String firstName, String lastname, String school)
    {
       this.firstName = firstName;
       this.lastName = lastname;
       this.school = school;
    }
    public static void Staticvar(String fristname, String lastname,String school)
    {
        StaticExample obj3 = new StaticExample();
        //In static method we can't initialize non static varible dircetly we need to crerat einstance of the class and use it to initialize
        //we can't use this keyword to initialize the static varibale because it is assocaite with class level no the obj level.
        //if we maniplaute static variable. it will affect at the class level.
        //we can use static block to initialize the static varibale
        //we can't non static method in static method without help obj.
        //we can call static method directly in styatic nethod
    }


    public static void main(String[] args )
    {
         StaticExample obj = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample.Staticvar("Akku","Pooku", "Akshara");
         obj.InstanceVar("Purnananda","Gorantla","klu");

         System.out.print(StaticExample.school);
         System.out.println(obj2.firstName);

    }
}
