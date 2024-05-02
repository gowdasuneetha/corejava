class Dolly{
	int a = 1000, b = 2522;
	public void add() {
		int c = a+b;
		System.out.println(c);
	}
}
class Dolly1 extends Dolly{
	public void sub() {
		int d = a-b;
		System.out.println(d);

	}
}
class Dolly2 extends Dolly1{
	public void mul() {
		int e = a*b;
		System.out.println(e);

	}
}
public class Multilevelexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dolly2 obj = new Dolly2();
obj.add();
obj.sub();
obj.mul();
	}

}
