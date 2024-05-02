class Alpha{
	public Alpha(){       //method
		System.out.println("student name");	}
	public Alpha(int a) {
		System.out.println("student branch");	
		}
	public Alpha(double b) {
		System.out.println("student roll no");	
	}
	public Alpha(long c) {
		System.out.println("student section");	
	}
public Alpha(float d,int e) {
	System.out.println("student personal details");	 // constructor overloading :--one class and same method having different parameters

}
	}

public class Consoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alpha obj = new Alpha();
Alpha obj1 = new Alpha(2);
Alpha obj2 = new Alpha(1.3);
Alpha obj3 = new Alpha(986620345l);
Alpha obj4 = new Alpha(5.06f);

	}

}
