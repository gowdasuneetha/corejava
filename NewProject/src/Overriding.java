class Over{
	public void hii() {
		System.out.println("use super keyword");
	}
}
class Riding extends Over{
	public void hii() {
		super.hii();
		System.out.println("super calling in child class");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Riding obj = new Riding();
obj.hii();
	}

}
