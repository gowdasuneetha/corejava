class Car{
	String name = "honda";
	int model = 2022;
	int speed = 55;
	int warranty = 2;
	public void a() {
		System.out.println(name);
	}
}
class Bike extends Car{
	public void b() {
		System.out.println(model);
	}
}
class Scooty extends Bike{
	public void c() {
		System.out.println(speed);
	}
}
class Shine extends Scooty{
	public void d() {
		System.out.println(warranty);
	}
}
public class Multilevelexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shine obj = new Shine();
obj.a();
obj.b();
obj.c();
obj.d();

	}

}
