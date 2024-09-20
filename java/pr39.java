// Write a java program which implements the use of runnable interface



class ClassA implements Runnable
{
    public void run() {
        for (int i = 0; i <= 100; i++) {
                     System.out.println("ThreadA: " + i);
        }
    }
}

class ClassB implements Runnable
{
    public void run() {
        for (int j = 0; j <= 100; j++) {
                   System.out.println("ThreadB: " + j);
        }
    }
}

class ClassC implements Runnable
{
        public void run() {
        for (int k = 0; k <= 100; k++) {
           System.out.println("ThreadC: " + k);
        }
    }
}

class pr39
{
public static void main(String args[])
{
ClassA a = new ClassA();
ClassB b = new ClassB();
ClassC c = new ClassC();


Thread threadA = new Thread(a);

Thread threadB = new Thread(b);


Thread threadC = new Thread(c);


threadA.start();
threadB.start();
threadC.start();
}

}
