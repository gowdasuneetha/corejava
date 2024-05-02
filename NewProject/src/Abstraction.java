abstract class Iphone11{
	public void call() {
		System.out.println("calling");	}
	abstract public void message();
	abstract public void music();
	abstract public void video();
}
abstract class Iphone12 extends Iphone11{
	public void message() {
		System.out.println("chatting");
	}
	abstract public void music();
	abstract public void video();
	
}
abstract class Iphone13 extends Iphone12{
public void music(){
System.out.println("musicc");
}
abstract public void video();
}
class Iphone14 extends Iphone13{
	public void video() {
		System.out.println("videoss");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Iphone14 obj = new Iphone14();
obj.call();
obj.message();
obj.music();
obj.video();
	}

}
