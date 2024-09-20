// Write a java program which shows the use of yield() , stop(), sleep() Methods.



class ClassA extends Thread
{
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i == 30) {
                Thread.yield();  // Qualify 'yield' with 'Thread'
            }
            System.out.println("ThreadA: " + i);
        }
    }
}

class ClassB extends Thread
{
    public void run() {
        for (int j = 0; j <= 100; j++) {
            if (j == 70) {
                try {
                    Thread.sleep(5000);  // Pausing for 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("ThreadB: " + j);
        }
    }
}

class ClassC extends Thread
{
    private volatile boolean running = true;

    public void run() {
        for (int k = 0; k <= 100 && running; k++) {
            if (k == 60) {
                running = false;  // Stopping the loop
            }
            System.out.println("ThreadC: " + k);
        }
    }
}

class pr37
{
    public static void main(String args[]) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        a.start();
        b.start();
        c.start();
    }
}
