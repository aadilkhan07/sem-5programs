// Write a java program which implements the use of hierarchical inheritance


class classA{
int no;
String name;
void getdata(int n,String na)
{
no = n;
name = na;

}

}

class classB extends classA{

int total,sub1,sub2,sub3;
float percentage;
void getmarks(int s1,int s2,int s3)
{
sub1 = s1;
sub2= s2;
sub3 = s3;

}

void calc()
{
total = sub1+sub2+sub3;
percentage = total /3;
}
void disp()
{
System.out.println("TOTAL IS =" +" "+total);


System.out.println("PERCENTAGE IS =" +" "+percentage);
}
}


class  classC extends classA
{

void display()
{

System.out.println("ROLLNO IS =" +" "+no);

System.out.println("NAME IS =" +" "+name);
}

}

class pr23
{

public static void main(String args[])
{

classB b1 = new classB();
classC c1 = new classC();


c1.getdata(102,"AADILKHAN");
c1.display();
b1.getmarks(90,88,77);
b1.calc();
b1.disp();


}
}
