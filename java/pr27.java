//Write a java program which implements interface



interface Vehicle
{

void start();

void stop();
}


class Car implements Vehicle
{
public void start()
{
System.out.println("The car start with a keky");
}

public void stop()
{

System.out.println("The car stops with a break");
}

}

class Bicycle implements Vehicle
{
public void start()
{
System.out.println("The bicycle start with a pedaling");
}

public void stop()
{

System.out.println("The bicycle stops with a hand-break");
}


}


class pr27{
public static void main(String []args)
{
Car car = new Car();
Bicycle bicycle = new Bicycle();


car.start();
car.stop();

bicycle.start();
bicycle.stop();

}
}
