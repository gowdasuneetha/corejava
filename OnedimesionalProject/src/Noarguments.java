class Demo{
	public Demo() {
		System.out.println("no arguments");   // no arguments constructor
	}
}

class Hii{
	public Hii(int a,char b) {   // parameterized constructor
		System.out.println("my name is suneetha");
	}
}
public class Noarguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo obj = new Demo();
Hii obj1 = new Hii(5,'g');
	}

}
