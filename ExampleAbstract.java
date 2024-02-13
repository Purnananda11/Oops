interface Vechicle{
    public void start();
    public void stop();
    public void ac();
    public void brake();
    public void mirror();
}
 abstract class CommonFeatures implements Vechicle{
    public void start()
    {
        System.out.println("Vechicle is started");
    }
    public void stop()
    {
        System.out.println("Vechicle is stopped");
    }
    public void ac()
    {
        System.out.println("ac is available");
    }
     abstract public void brake();// it is optional to have these unimplemented methods. If we decisied to include then we have to declare as abstract
    abstract public void mirror();

}
class Car extends CommonFeatures
{

    @Override
    public void brake() {
        System.out.println("Have normal brakes");
    }

    @Override
    public void mirror() {
            System.out.println("Have nor mirrors");
    }
}
class Truck extends CommonFeatures
{

    @Override
    public void brake() {
        System.out.println("Have hydralic brakes");
    }

    @Override
    public void mirror() {
       System.out.println("Have big mirrors");
    }
}


public class ExampleAbstract {
    public static void main(String[] args)
    {
        Car car = new Car();
        car.start();
        car.stop();
        car.ac();
        car.brake();
        Truck truck = new Truck();
        truck.start();
        truck.stop();
        truck.ac();
        truck.brake();
    }
}
//In this we have any common code between all the classes we can write in one abstract class and use in another classes by extending it.

