class Van{
	String name = "mahindra";
	String style = "minivan";
	int doors = 5;
	int model = 2023;
	public void mini() {
		System.out.println(name + style + doors + model);
	}
}
class Van1{
	public void Minu() {
		System.out.println("speed power 26 hp");
	}
}
class Lorry extends Van1,Van{
	public void manu() {
		System.out.println("success");
	}
}
public class Multiplelevelexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
