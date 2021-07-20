package com;

public class A {
	private int i;
	int j;
	protected int k;
	public int l;
	

}
class B {
	void test () {
		A a = new A();
		a.j= 20;
		a.k=30;
		a.l=40;
		
	}
}
