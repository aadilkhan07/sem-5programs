// Write a java program that will take command line argument and display the same.

class PR11{

public static void main (String[] args) {
if(args.length>0){

for(String arg : args)
{
	System.out.println(arg);
	
}
}else{
	System.out.println("No arguments");
}

}	
}
