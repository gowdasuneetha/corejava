class Suno{
	public void hi() {
		System.out.println("hii");
	}
	public void hi(int a) {
		System.out.println("hello");

	}
	public void hi(double a, char c) {
		System.out.println("bye");
	}
	public void hi(int a, long b) {
		System.out.println("good bye");

	}
}

public class Polymorphismoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Suno obj = new Suno();
obj.hi(2);
obj.hi();
obj.hi(1.5,'d');
	}
}
