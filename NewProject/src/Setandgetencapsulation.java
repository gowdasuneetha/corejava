class Student{
	private String name;
	private String branch;
	private String sect;
	private int rono;
	public void setname(String a) {
		name = a;
	}
	public String getname() {
		return name;
	}
	public void setbranch(String b) {
		branch = b;
	}
	public String getbranch() {
		return branch;
	}
	public void setsect(String c) {
		sect = c;
	}
	public String getsect() {
		return sect;
	}
	public void setrono(int d) {
		rono = d;
	}
	public int getrono() {
		return rono;
	}
}
public class Setandgetencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj1 = new Student();
obj1.setname("anshita");
obj1.setbranch("ece");
obj1.setsect("ece-b");
obj1.setrono(415);
System.out.println(obj1.getname());
System.out.println(obj1.getbranch());
System.out.println(obj1.getsect());
System.out.println(obj1.getrono());


	}

}
