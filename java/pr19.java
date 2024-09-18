//19. Write a java program which implements the Parameterized Constructors. 
//
class p_constructor 
{
	int length;
	int width;

	p_constructor(int a,int b) 
	{
		length=a;
		width=b;
	}
	int area()
	{
		return(length*width);
	}

}

class p19
{
	public static  void main(String args[])
	{
	   p_constructor p1= new p_constructor(19,20);
	   int area1;
	   area1=p1.area();
	   System.out.print("area="+area1);
	}
}


