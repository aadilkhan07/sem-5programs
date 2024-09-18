// 20. Write a java program which implements the Overloading of Constructors. 
//
//

class  rect
{
	int length,width;

	rect()
	{
		length=10;
		width=15;
	}

	rect(int a)
	{
		length=a;
		width=a;
	}

	rect(int a,int b)
	{
		length=a;
		width=b;
	}

	int calArea()
	{
		return(length * width);
	}

}


class pr20
{
	public static void main(String args[])
	{
                rect r1=new rect();
		rect r2=new rect(10);
		rect r3=new rect(15,20);
		System.out.println("area of rect="+r1.calArea());
		System.out.println("area of rect="+r2.calArea());
		System.out.println("area of rect="+r3.calArea());
	}
}
		
		
