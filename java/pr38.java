// Write a java progam which shows priorities in thread



class ClassA extends Thread
{
    public void run() {
        for (int i = 0; i <= 100; i++) {
                     System.out.println("ThreadA: " + i);
        }
    }
}

class ClassB extends Thread
{
    public void run() {
        for (int j = 0; j <= 100; j++) {
                   System.out.println("ThreadB: " + j);
        }
    }
}

class ClassC extends Thread
{
        public void run() {
        for (int k = 0; k <= 100; k++) {
           System.out.println("ThreadC: " + k);
        }
    }
}
class pr38{

public static void main(String args[])
{
	ClassA a = new ClassA();
	ClassB b = new ClassB();
	ClassC c = new ClassC();


	a.setPriority(Thread.MIN_PRIORITY);
	b.setPriority(Thread.NORM_PRIORITY);
	c.setPriority(Thread.MAX_PRIORITY);

	System.out.println("Strating threadA with MIN_PRIORITY");
	a.start();
	System.out.println("Strating threadB with NORM_PRIORITY");
	b.start();
	System.out.println("Strating threadA with MAX_PRIORITY");
	c.start();


}

}
