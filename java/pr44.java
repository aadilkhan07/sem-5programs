// Write a java program which shows throwing own exception

class MyCustomException  extends Exception {

	public MyCustomException(String message){
		super(message);
	}

}


class pr44{

	public static void main(String args[])
	{
		int a = 5, b= 9;

		int c = a - b;

		try{

			if(c < 0)
			{
				throw new MyCustomException("C is less than zero");
			}System.out.println(c);
		}catch(Exception e){
				System.out.println("An unexpected error occured: "+" "+e.getMessage());
		}

	}
}
