
public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 9;
	//	int b = 0;
		//int c = a/b;
	//System.out.println(c);
		int d = 9;
		int e = 0;
		try {
			int f = d/e;
			System.out.println(f);
		}
		catch(Exception g) {
			System.out.println("divided by zero is not possible");
		}
	}
}
