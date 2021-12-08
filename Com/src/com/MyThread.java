package com;
class DemoThreadInterface implements Runnable
{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
		System.out.println("My Thread ..."+i+ " "+Thread.currentThread().getName());
		}
	}
	
}



class DemoThread extends Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("My Thread ..."+currentThread().getName());
	}

	
}

public class MyThread {
	public static void main(String arg[])
	{
		//DemoThread demoThread=new DemoThread();
		//demoThread.start();
		
		DemoThreadInterface demoThreadInterface=new DemoThreadInterface();
		Thread t1=new Thread(demoThreadInterface);
		Thread t2=new Thread(demoThreadInterface);
		t1.setName("t1");
		t2.setName("t2");
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}
