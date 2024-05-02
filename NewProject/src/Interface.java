interface Samsung20{
abstract public void message();
}
class Samsung21 implements Samsung20{
public void message(){
	System.out.println("hello");}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung21 obj = new Samsung21();
		obj.message();
	}

}
