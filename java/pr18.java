// write a program which implements Default Constructor
//


 class d_constructor
{
	 int length;
	 int width;

	 d_constructor()

	 {
		 length=50;
		 width=5;
	 }

	 int area()
	 {
		 return(length*width);
	 }

}


	class pr18
	{
		public static void main(String args[])
		{
			d_constructor p1=new d_constructor();
			int area1;
			area1=p1.area();
			System.out.println("Area="+area1);	

		 }
	}

