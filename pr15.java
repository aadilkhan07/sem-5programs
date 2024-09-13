//Write a java program which shows the use of static keyword



class Counter{

static int count = 0;

//Constructor

Counter(){

count ++;
}
static int getCount()
{
return count;
}
}

class pr15{

public static void main(String []args)
{
Counter c1 = new Counter();

Counter c2 = new Counter();


Counter c3 = new Counter();

System.out.println("Number of counts = " +Counter.getCount());
}


}
