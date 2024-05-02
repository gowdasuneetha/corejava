class Suni{
	public Suni() {
		System.out.println("name is suneetha");
	}
	public Suni(int a) {
		System.out.println("roll no 414");
	}
	public Suni(double b,char c) {
		System.out.println("branch is ECE");

	}         // constructor overloading:-- same class name having different constructors and different parameters 
}
public class Constructoroverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Suni obj = new Suni();
Suni obj1 = new Suni(4);
Suni s = new Suni(0.5,'d');
	}

}
