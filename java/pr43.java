// Write a java program which uses multiple try statement


class pr43
{

public static void main(String args[])
{
int a[] =  {1,2,4,32,2,45};
int b = 0;

try{
	int  c  = a[4] / b;
try{
	System.out.println("Let's  access which is not there"+" "+a[9]);
}catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Bad index vro!");
}
}catch(ArithmeticException e){
System.out.println("Division by zero really???");
}

finally{
System.out.println("We are in finally block it will execute anyway , you can't stop me from printing");

}



}
}
