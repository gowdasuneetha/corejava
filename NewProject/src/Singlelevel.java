class Addition{
	int a = 3;
	int b = 2;
	public void add() {
		int c = a+b;
		System.out.println(c);	}
}
class Substraction extends Addition{
	public void sub() {
		int d = a-b;
		System.out.println(d);
	}
}
class Multiplication extends Substraction{
	public void mul() {
		int e = a*b;
		System.out.println(e);
	}
}
class Division extends Multiplication{
	public void div() {
		int f = a/b;
		System.out.println(f);
	}
}
public class Singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Substraction obj = new Substraction();
Multiplication obj1 = new Multiplication();
Division obj2 = new Division();
obj.add();
obj.sub();
obj1.mul();
obj2.div();
	}

}
