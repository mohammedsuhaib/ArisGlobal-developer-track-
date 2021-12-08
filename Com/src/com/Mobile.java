package com;

public class Mobile {
	public int getProc() {
		return proc;
	}
	public void setProc(int proc) {
		this.proc = proc;
	}
	public void setProc(int p,int mod) {
		this.proc=p;
		this.model=mod;
	}
	int proc=10;
	int model;
	 void work() {
		System.out.println("Hello Mobile");
	}
	public static void main(String args[]) {
		Mobile a = new Samsung();
		a.work();
		Mobile b=new Sony();
		b.setProc(5);
		System.out.println(b.getProc());
		b.setProc(4, 9);
		System.out.println(b.getProc());
		Sony c=new Sony();
		System.out.println(c.ssize+" "+c.getSsize());
	}
}
class Sony extends Mobile{
	public int getSsize() {
		return ssize;
	}
	public void setSsize(int ssize) {
		this.ssize = ssize;
	}
	int ssize=6;
	void work() {
		System.out.println("Hello Sony");
	}
}
class Samsung extends Mobile{
	public int getSsize() {
		return ssize;
	}
	public void setSsize(int ssize) {
		this.ssize = ssize;
	}
	int ssize=7;
	void work() {
		System.out.println("Hello Samsung");
	}
}
class Nokia extends Mobile{
	public int getSsize() {
		return ssize;
	}
	public void setSsize(int ssize) {
		this.ssize = ssize;
	}
	int ssize=10;
	void work() {
		System.out.println("Hello Nokia");
	}
}