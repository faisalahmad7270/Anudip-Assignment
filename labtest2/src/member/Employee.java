package member;

public class Employee extends Member {
	String specialization;
	
	Employee(String name,int age,int pnum,String address,int salary,String specialization){
		super(name,age,pnum,address,salary);
		this.specialization=specialization;
		
	}
	public void print() {
		super.print();
		System.out.println(specialization);
	}

}
