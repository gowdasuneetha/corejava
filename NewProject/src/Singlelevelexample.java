class Mono{
	int a = 305, b = 555;
	int c = a+b;
	public void add() {
		System.out.println(c);
	}
}
class Mono1 extends Mono{
	public void sub() {
		
		int d = a-b;
		System.out.println(d);
	}
}
class Mono2 extends Mono1{
	public void mul() {
		int e = a*b;
		System.out.println(e);
	}
}
public class Singlelevelexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mono1 s = new Mono1();
Mono2 obj = new Mono2();
s.add();
s.sub();
obj.mul();
	}

}
