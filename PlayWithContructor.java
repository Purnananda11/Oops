public class PlayWithContructor {
    String name ;
    String company;
    double salary;
    String address;
  public PlayWithContructor(String name, String company, double salary)
  {
      this.name = name;
    this.company = company;
      this.salary = salary;
  }
//Constructor overloading by usinf different number of parameters
    public PlayWithContructor(String name, String company, double salary, String address)
    {
      this(name, company, salary);
      this.address = address;
    }
//  void display()
//  {
//      System.out.println(name+" "+company+" "+salary);
//  }

  public static void main(String[] args)
  {
//       new PlayWithContructor("Purnananda","BNYMellon",10000).display(); usage of anonymous object
      PlayWithContructor obj = new  PlayWithContructor("Purnananda","BNYMellon",10000);
      PlayWithContructor obj1 = new  PlayWithContructor("Purnananda","BNYMellon",10000, "Guntur");



  }


}
