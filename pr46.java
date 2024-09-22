// Create a java program which uses init(), start(), stop(),  and Destroy methods of Applet()

import java.applet.Applet;
import java.awt.Graphics;

public class pr46 extends  Applet{
	
	public void init(){
		System.out.println("Applet Initialized");
	}
	public void start(){
		System.out.println("Applet Started");
	}
	public void stop(){
		System.out.println("Applet Stopped");
	}
	public void destroy(){
		System.out.println("Applet Destroyed");
	}
	
	public void paint(Graphics g){
		g.drawString("Using init,start,stop,destroy",100,100);
	}
}