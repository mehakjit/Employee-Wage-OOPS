package capgemini;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program ");
		
		WageBuider j = new WageBuider();
		j.addCompany("Capg", 50, 100, 20);
		j.addCompany("Alan", 20, 100, 20);
		
	}
}