// 5. Write a program using switch statement

import  java.util.Scanner;
class switchStatemnt{
	
	public static void main (String[] args) {
    
    Scanner s1 = new Scanner(System.in);
    int no;
    System.out.println("Enter no:");
    no = s1.nextInt();
    switch(no){
    	case 1: 
    		System.out.println("Monday");
    	break;
    	case 2 : 
			System.out.println("Tuesday");
    	break;
    	case 3 :
    		    		System.out.println( "Wednesday");
    	break;
    	case 4 :     		System.out.println("Thursday");
    	break;
    	case 5 :     		System.out.println("Friday");
    	break;
    	case 6 :     		System.out.println("Saturday");
    	break;
    	case 7 :     		System.out.println("Sunday");
    	break;
    	default :
    		System.out.println("Invalid inputs");
    		break;
    }
    }
	
}