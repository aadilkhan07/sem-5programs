//Program that will accept command line Argunments and display the same.
//


class pr11 {
	public static void main(String args[])
	{
		int i=0,a,b,sum;
		System.out.println("NO OF ARG:"+args.length);
			while(i<args.length)
			{
				System.out.println(args[i]);
				i++;
			}
		a=Integer.parseInt(args[2]);
		b=Integer.parseInt(args[3]);
				
				sum=a+b;
				
		System.out.println("addition="+sum);
	}
}


