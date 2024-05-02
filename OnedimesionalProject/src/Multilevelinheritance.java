class A{
	int a = 7, b = 8, c = 9;
	public void add() {   //parent class
		int d = a+b+c;
		System.out.println(d);
	}
}
class B extends A{
	public void sub() {
		int e = a-b-c;
		System.out.println(e);
	}
}
class C extends B{
	public void mul() {
		int f = a*b*c;
		System.out.println(f);
	}
}
class D extends C{
	public void div() {
		int e = a/b/c;
		System.out.println(e);
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D s =new D();
s.add();
s.sub();
s.mul();
s.div();
	}

}
