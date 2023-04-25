package com.cg.multipleinheritance;

class Dad{
	void snoring() {
		System.out.println("Yes, I have the habit of snoring");
	}
}
class Mom{
	void snoring() {
		System.out.println("Yes, I do have that habit");
	}
}
class You{
	void snoring() {
		System.out.println("No, I do not have that habit");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Dad d = new Dad();
		d.snoring();
		
		Mom m = new Mom();
		m.snoring();
		
		You y= new You();
		y.snoring();

	}

}
