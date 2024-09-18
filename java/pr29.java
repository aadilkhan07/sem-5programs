//Write a java program which shows importing of classes from another package

package main;
import shapes.package_29;

public class pr29
{
public static void main(String args[])
{
	package_29 circle = new package_29(5.0);
	System.out.println("Area is "+" "+circle.area());
	
	System.out.println("Circumference is:"+" "+ circle.circumference());
}
}


