class fact{
	
	public static void main (String[] args) {
    int no = 5;
    int factorial = 1;
    
    for (int i = 1; i<=no; i++){
    	factorial = factorial*i;
    	
    }
    System.out.println("Factorial is ="+ factorial);
    }
}