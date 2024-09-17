
// 15. Write a java program which shows the use of Static Members. 

class xyz
{
	int a;
	static int x;
	void get()
	{
		a++;
		x++;
	}
	
	void display()
	{
		System.out.println(a);

		System.out.println(x);
	}
}


class static_demo
{
	public static void main(String args[])
	{	xyz x1=new xyz();
	 	xyz x2=new xyz();
	 	xyz x3=new xyz();
	 	
	 	
	 	x1.get();
	 	x2.get();
	 	x3.get();
	 	x1.display();
	 	x2.display();
	 	x3.display();
	 	
	}
	
}