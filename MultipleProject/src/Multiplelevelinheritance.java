class A{
	public void add() {
		System.out.println("hii");	}
}

class B{
	public void sub() {
		System.out.println("hello");
	}
}

class C extends B,A{
	public void mul() {
		System.out.println("bye");
	}
}
public class Multiplelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj = new C();
obj.mul();
	}

}
