/*Write a java program which shows the use of yield(), stop() and 
 sleep methods. */
 
 class threadA extends Thread{
 	public void run()
 	{
 		for(int i = 0; i<=100;i++){
 			if(i == 30)
 			{
 				Thread.yield();
 			}
 			System.out.println("THREAD A =" +i);
 		}
 	}
 }
 
 
// class threadB extends Thread{
// 	public void run()
// 	{
// 		for(int j = 0; j<=100;j++){
// 			if(j == 50)
// 			{
// 				Thread.stop();
// 			}
// 			System.out.println("THREAD B =" +j);
// 		}
// 	}
// }
//
class threadB extends Thread {
    private volatile boolean stopRequested = false;  // Flag for stopping the thread safely
    
    public void run() {
        for (int j = 0; j <= 100 && !stopRequested; j++) {
            if (j == 50) {
                System.out.println("Thread B stopping at: " + j);
                stopRequested = true;  // Set flag to stop the thread safely
            }
            System.out.println("THREAD B = " + j);
        }
    }
    
    public void requestStop() {
        stopRequested = true;
    }
}
 
 class threadC extends Thread{
 	public void run()
 	{
 		for(int k = 0; k<=100;k++){
 			if(k == 70)
 			{
 				try{
 					sleep(10000);
 				}catch(Exception e){
 					System.out.println("Slept for 10 Seconds");
 				}
 			}
 			System.out.println("THREAD C =" +k);
 		}
 	}
 }
 
 class calling{
 	public static void main (String[] args) {
	
	threadA a1 = new threadA();
	a1.start();
	
	threadB b1 = new threadB();
	b1.start();
	
	threadC c1 = new threadC();
	c1.start();
	 }
 }