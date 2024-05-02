
public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 1;
		try{
		int c = a/b;
		System.out.println(c);
		throw new RenukaException();
		}
		catch(Exception e){
		System.out.println("divided by one is not possible");
		}}}
	
