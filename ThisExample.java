public class ThisExample {
    int a;
    int b ;
    int c;
    public ThisExample(int a, int b)
    {
        this.a = a;// Here this is used to solve ambigity bet instance variables and parameters of the TzhisExample method
        this.b = b;
    }
    public  ThisExample(int a, int b, int c)
    {
        this(a, b);// we can invoke the current class construcor
        this.c =c;

    }

    public void Add()
    {
        int c = a+b;
        System.out.println(c);
    }
    public void  Sub()
    {
        Add();// We can use this keyword to call the method in another method using this keyword. if don't use explicitly compiler will use it.

        int c = a-b;
        System.out.println(c);
    }



    public  static void main(String[] args)
    {
         ThisExample obj = new ThisExample(1,2);
         obj.Sub();
         ThisExample obj2 = new ThisExample(1,2,3)
    }

}
