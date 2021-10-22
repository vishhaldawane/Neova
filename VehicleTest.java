import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class VehicleTest {
	public static void main(String[] args) {
		
		Car theCar = new Car();
		Ship theShip = new Ship();
		Airplane thePlane = new Airplane();
		Bike theBike = new Bike();
	    Railway theRailway = new Railway();
		
		Thread t1 = new Thread(theCar);
		Thread t2 = new Thread(theShip);
		Thread t3 = new Thread(thePlane);
		Thread t4 = new Thread(theBike);
		Thread t5 = new Thread(theRailway);
		
		t1.setPriority(Thread.MIN_PRIORITY); //1
		t2.setPriority(Thread.NORM_PRIORITY); //5- default
		t3.setPriority(Thread.MAX_PRIORITY); //10
		t4.setPriority(Thread.MAX_PRIORITY); 
		t5.setPriority(Thread.MAX_PRIORITY); 
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}

class Car extends JFrame implements Runnable // Thread
{
	public void run() {
		for(int i=0;i<1000000;i++) {
			//System.out.println("Driven "+i+" Kms");
			data.setText("Driving "+i);
		}
	}
	 
	JTextField data = new JTextField(20); //ctrl + shift + M 
	
	Car() {
		setSize(300,100);
		setLocation(100,100);
		setLayout(new FlowLayout());
		add(data);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

class Ship extends JFrame implements Runnable // Thread
{
	public void run() {
		for(int i=0;i<1000000;i++) {
			//System.out.println("Sailed "+i+" NMiles");
			data.setText("Sailing "+i);
		}
	}
	JTextField data = new JTextField(20); //ctrl + shift + M 
	
	Ship() {
		setSize(300,100);
		setLocation(300,300);
		setLayout(new FlowLayout());
		add(data);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}

class Airplane extends JFrame implements Runnable // Thread
{
	public void run() {
		for(int i=0;i<1000000;i++) {
			//System.out.println("Flying "+i+" ANMiles");
			data.setText("Flying "+i);
		}
	}
	
	JTextField data = new JTextField(20); //ctrl + shift + M 
	
	Airplane() {
		setSize(300,100);
		setLocation(500,500);
		setLayout(new FlowLayout());
		add(data);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class Bike extends JFrame implements Runnable // Thread
{
	public void run() {
		for(int i=0;i<1000000;i++) {
			//System.out.println("Sailed "+i+" NMiles");
			data.setText("Riding "+i);
		}
	}
	JTextField data = new JTextField(20); //ctrl + shift + M 
	
	Bike() {
		setSize(300,100);
		setLocation(50,50);
		setLayout(new FlowLayout());
		add(data);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}

class Railway extends JFrame implements Runnable // Thread
{
	public void run() {
		for(int i=0;i<1000000;i++) {
			//System.out.println("Sailed "+i+" NMiles");
			data.setText("traveling "+i);
		}
	}
	JTextField data = new JTextField(20); //ctrl + shift + M 
	
	Railway() {
		setSize(300,100);
		setLocation(250,250);
		setLayout(new FlowLayout());
		add(data);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
