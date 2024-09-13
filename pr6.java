// write a java program to do sum of a given number

class sum
{
	
	public static void main (String[] args) {
   	int no = 123777;
 	int sum = 0;
   	int rem;
   	
   	while(no>0)
   	{
   		rem = no %10;
   		sum = sum +rem;
   		no = no /10;
   	}
   	System.out.println("Sum is "+ sum);
    }
}