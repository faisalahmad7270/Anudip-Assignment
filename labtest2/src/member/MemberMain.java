package member;

public class MemberMain {

	public static void main(String[] args) {
		Employee em = new Employee("Faisal",23,56382927,"Delhi",25000,"Software engg");
		Manager mn = new Manager("Faisal",23,56382927,"Delhi",25000,"Computer Science");
		em.print();
		mn.print();
	}

}
