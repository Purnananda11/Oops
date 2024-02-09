public class Practice {
    String firstName;
    String lastName;
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    void display()
    {
        System.out.println(getFirstName()+" "+getLastName());
    }





    //    public Practice(String f, String l)
//    {
//        firstName = f;
//        lastName =l;
//    }
//    void display()
//    {
//        System.out.println("full name is "+firstName+lastName);
//    }

    public static void main(String[] args)
    {
//        Practice obj = new Practice("Purnannada", "Gorantla");
//        obj.display();
//        Practice obj = new Practice();
//        obj.firstName="Purnananda";
//        obj.lastName ="Gorantla";
//        System.out.println("full name is "+obj.firstName+" "+obj.lastName);
        Practice obj = new Practice();
        obj.setFirstName("Purnananda");
        obj.setLastName("Gorantla");
        obj.display();

    }


}
//In this we try to implement three ways to initialize the instance variables
//By using constructor
//By using obj
//By using method
