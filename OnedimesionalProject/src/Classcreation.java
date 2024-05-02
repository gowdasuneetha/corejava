class Abcd{
	int a = 10;
	int b = 20;
	int c = a+b;  // class creation
	public void mul() {
		int d = a*b;    // method creation
		System.out.println(d);
	}
}
public class Classcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abcd obj = new Abcd(); //object creation 
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);
obj.mul();
	}

}
