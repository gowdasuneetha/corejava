interface A{
	public void ad() {
		System.out.println("hello");
	}
}
class B{
	public void su() {
		System.out.println("hii");

	}
}
class C extends B implements A{
	public void mu() {
		System.out.println("bye");

	}
}
public class Multipleexamplepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj = new C();
obj.ad();
obj.su();
obj.mu();
	}

}
