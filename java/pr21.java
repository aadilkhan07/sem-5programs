// Write a java program which shows the implement of Single inheritance


class student {
int roll_no;
String name;
void getdata(int no, String na)

{

roll_no = no;
name = na;

}



}
class details extends student{



void display(){
System.out.println("Roll_no is:"+roll_no);
System.out.println("Roll_no is:"+name);


}


}
class pr21{

public static void main(String args[])
{
details d1 = new details();
d1.getdata(102,"AADILKHAN");
d1.display();

}

}
