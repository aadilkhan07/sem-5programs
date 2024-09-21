// Write a java program which uses finally statement

class pr42{


public static void main(String args[]){

int a = 0;
int b[] = {1,3,5,2,44,4};

try{

	int c = b[0]/a;

}catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Bad index error");
}catch(ArithmeticException e)
{

System.out.println("Can't divide by zero");

}
finally{
System.out.println("We are in finally block it will execute anyway , you can't stop me from printing");

}
}

}
