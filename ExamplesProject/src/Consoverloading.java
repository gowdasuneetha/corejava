class Pinnk{
	public Pinnk() {
		System.out.println("employee name");
	}
	public Pinnk(int a) {
		System.out.println("employee id");
	}
	public Pinnk(int b, double g) {
		System.out.println("employee city");
	}
	public Pinnk(double c) {
		System.out.println("employee mobile no");
	}
	public Pinnk(short d,long l) {
		System.out.println("employee ctc");
	}
}
public class Consoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method st
Pinnk ob = new Pinnk();
Pinnk obj = new Pinnk(2);
Pinnk obj1 = new Pinnk(2.5);
Pinnk obj2 = new Pinnk(3,1.5);



	}

}
