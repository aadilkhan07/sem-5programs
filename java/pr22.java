// Write a java program which shows the use of multilevel inheritance 


class student {

int no;
String name;

void getdata(int n, String na)
{
no = n;
name = na;
}

}


class sports extends student
{
	int tt , badminton;
void sports_marks(int t,int bad)
{
tt = t;
badminton = bad;

}



}

class marks extends sports{


void display()
{
System.out.println("Roll no is" +" " +no);
System.out.println("Name is "+ " "+name);

System.out.println("Name is "+ " "+tt);
System.out.println("Name is "+ " "+badminton);

int total_marks= tt + badminton;
System.out.println("Name is "+ " "+total_marks);



}

}

class pr22{

public static void main(String args[])
{
marks m1 = new marks();
m1.getdata(102,"AADILKHAN");
m1.sports_marks(99,70);
m1.display();

}
}
