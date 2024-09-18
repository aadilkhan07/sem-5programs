//Creatig package


package shapes;

public class package_29{

	private double radius;


	public package_29(double radius)
	{
		this.radius = radius;
	}

	public double area()
	{
		return Math.PI * radius * radius;
	}

	public double circumference()
	{
		return 2 * Math.PI * radius;
	}

}
