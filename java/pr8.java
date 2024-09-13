// Write a java program that check wether the number is prime or not

class prime{
	
	public static void main (String[] args) {
    
    int no =37;
    int counter =0;
    for( int i = 1 ; i<= no; i++)
    {
    	if(no % i ==0){
    		counter++;
    	}
    }
    if(counter == 2){
    	System.out.println("Number is prime"+no);
    }else{
		System.out.println("Number is not an prime number"+no);
    }
    }
}