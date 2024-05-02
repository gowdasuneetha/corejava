class Addition{
	int a = 3, b = 5;
	public void add() {  // parent class or super class
		int c = a+b;
		System.out.println(c);   // single inheritance --> 1 parent class and 1 child class
	}
}

class Substraction extends Addition{   //child class or sub class
	public void sub() {
		int d = a-b;
		System.out.println(d);
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Substraction s = new Substraction();
s.add();
s.sub();
	}

}
