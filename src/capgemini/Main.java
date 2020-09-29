package capgemini;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program ");
		Scanner sc =new Scanner(System.in);
		WageBuider j = new WageBuider();
		j.addCompany("Capg", 50, 100, 20);
		j.addCompany("Alan", 20, 100, 20);
		System.out.println("Total Wage for "+ j.getTotalWage(sc.nextLine()));
	}
	
}