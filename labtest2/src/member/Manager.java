package member;

public class Manager extends Member {
	String department;
	
	Manager(String name,int age,int pnum,String address,int salary,String department){
		super(name,age,pnum,address,salary);
		this.department=department;
		
	}
	public void print() {
		super.print();
		System.out.println(department);
	}

}
