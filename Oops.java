public class Oops {
    int a =0;
    int b =0;
    public  void Setters(int c, int d)
    {
        a =c;
        b =d;
    }
    public int getterVariablea()
    {
        return a;
    }
    public int getterVariableb()
    {
        return b;
    }

//    public Oops(int a , int b)
//    {
//        this.a =a;
//        this.b = b;
//    }

    public static void main(String[] args)
    {
//        Oops obj1 = new Oops(3,4); initialization of obj through the constructor
//        obj1.a = 1;// One of object initialization
//        obj1.b = 2;
        Oops obj1 = new Oops();//third way is by using the setters and getters

       obj1.Setters(3,4);
       System.out.println("Value of a "+obj1.getterVariablea()+" value of b "+obj1.getterVariableb());


    }

}
