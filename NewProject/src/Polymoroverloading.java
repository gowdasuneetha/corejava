class Overloading{
	public Overloading() {
		System.out.println("tcs");
	}
	public Overloading(int a) {
		System.out.println("techmahindra");
	}
	public Overloading(double b) {
		System.out.println("ibm");
	}
	public Overloading(int f,double g) {
		System.out.println("infosys");

	}
}
public class Polymoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading over = new Overloading();
Overloading over1 = new Overloading(2);
Overloading over2 = new Overloading(3.5);
Overloading over3 = new Overloading(5,0.5);
	}

}
