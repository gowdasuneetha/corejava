class Employee{
	private int id;
	public void setid(int a) {
		id = a;
	}
public int getid() {
	return id;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj = new Employee();
obj.setid(414);
System.out.println(obj.getid());
	}

}
