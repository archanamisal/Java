package com.seed.TestPack;

import com.seed.package1.A;
import com.seed.package2.C;

public class TestPackage {
	public static void main(String[] args) {
		System.out.println("PACKAGE ONE ! ! !");
		A a=new A(); 
		a.display();
		
		//another way of calling package class called FULLY QUALIFILED(either way)
		
		com.seed.package1.B b=new com.seed.package1.B();
		b.print();
		
		
		System.out.println("PACKAGE TWO ! ! !");
		
		C c=new C();
		c.display();
		
		com.seed.package2.D d=new com.seed.package2.D();
		d.print();
		
		
		
	}
	
	

}
