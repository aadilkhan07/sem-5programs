//
//16. Write a java program which shows the Nesting of Methods. 

//nesting of method
class largest
{
	int x,y;
//	largest(int a,int b)
   void getdata(int a,int b)
	{
		x=a;
		y=b;
	}
	int large()
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
		void display()
		{
			System.out.println("largest="+large());
		}
}
	class largest_num
	{
		public static void main(String args[])
		{
		largest x1=new largest();
		x1.getdata(20,50);
		x1.display();
	    }
	}