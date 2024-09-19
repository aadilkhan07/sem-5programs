// Write a java program to implements the methods of string class


class pr31
{
	public static void  main(String args[]){
	String name = "Aadil";
	
	String name1 = "KHAN";
	System.out.println("NAME IN UPPERCASE:"+" "+name.toUpperCase());
	
	System.out.println("NAME IN LOWERCASE:"+" "+name.toLowerCase());
	
	
	System.out.println("NAME AT CHAR:"+" "+name.charAt(0));


	System.out.println("CONCAT METHOD :"+" "+name.concat(name1));

	System.out.println("SUBSTRING METHOD:"+" "+name.substring(2,4));

	System.out.println("IS EMPTY METHOD:"+" "+name.isEmpty());
	
	System.out.println("LENGTH METHOD:"+" "+name.length());
}
}
