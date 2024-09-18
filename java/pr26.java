// Write a java program which implements the use of abstract class and abstract method 

/*An abstract class is a class that serves as a blueprint and cannot be used to create objects directly, containing methods that may or may not have implementations.

An abstract method is a method without a body that must be defined by any subclass of the abstract class.*/


abstract class Animal{

public abstract void sound();

public void sleep()
{
System.out.println("Animal is sleeping");
}
}


class Cat extends Animal
{

public void sound()
{
System.out.println("The cat meows");

}
}

class Dog extends Animal
{

public void sound()
{
System.out.println("The dog barks");
}
}

class pr26
{

public static void main(String args[])
{
Cat c = new Cat();
Dog d = new Dog();

c.sound();
c.sleep();

d.sound();
d.sleep();
}
}
