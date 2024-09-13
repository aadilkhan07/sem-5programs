// Write a java program which will display the sum of 1 + 1/2 +1/3 ...1/n

class harmonicSerires{
	
	public static void main (String[] args) {
    int no = 10;
    double  sum = 0;
    
    for(int i = 1 ; i <=no; i++){
        	sum = sum+ 1.0 / i;
    }
    System.out.println("Sum of series is" + sum);
}
}