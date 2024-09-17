//17. Write a java program which shows the use of Methods Overloading.



//method overloading
class area_method
{
	 int area(int length)
	 {
	 	return(length*length);
	 }
	 int area(int length,int width)
	 {
	 	return(length*width);
	 }
	 float area(float r)
	 {
	 	return(3.14f*r*r);
	 }
}
class method_over
{
	 public static void main(String args[])
	 {
	 	area_method a1=new area_method();

	 	System.out.println("area of square="+a1.area(5));

	 	System.out.println("area of rectangle="+a1.area(10,20));
	 	
	 	System.out.println("area of circle="+a1.area(5.0f));
	 }
}