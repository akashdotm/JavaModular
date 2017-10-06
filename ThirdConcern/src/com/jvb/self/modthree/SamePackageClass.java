package com.jvb.self.modthree;

public class SamePackageClass {
	private int a;
	
	public SamePackageClass(int a) {
		this.a = a;
	}
	public void samePackageMethod() {
		System.out.println("printing the value of a: "+a);
	}
}
