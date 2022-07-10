package com.tns.java;

class car{
	void wholecar() {
	System.out.println("I am car");
}
}
class engine extends car{
    void rrrr() {
	System.out.println("I am engine");
}
}
class transmission extends engine{
    void upshift() {
	System.out.println("I am transmission");
}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		transmission trans = new transmission();
		trans.wholecar();
		trans.rrrr();
		trans.upshift();

	}

}
