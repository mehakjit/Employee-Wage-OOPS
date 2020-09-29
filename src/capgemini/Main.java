package capgemini;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program ");
		
		WageBuider j = new WageBuider();
		System.out.println(j.Wage("Capgemini",50,100,20));
		System.out.println(j.Wage("Elante",50,200,50));

}
}