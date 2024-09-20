// Write a java program which creates threads using thread class


class ClassA extends Thread
{
public void run(){
for(int i = 0; i<=100;i++)
{
	System.out.println("ThreadA:"+" "+i);
}
}
}

class ClassB extends Thread
{
public void run()
{
for(int j = 0; j<=100;j++)
{
	System.out.println("ThreadB:"+" "+j);
}
}
}
class ClassC extends Thread
{
public void run()
{

for(int k = 0; k<=100;k++)
{
	System.out.println("ThreadC:"+" "+k);
}
}
}
class pr36
{
public static void main(String args[])
{
ClassA a = new ClassA();
ClassB b = new ClassB();
ClassC c = new ClassC();

a.start();
b.start();
c.start();

}
}
