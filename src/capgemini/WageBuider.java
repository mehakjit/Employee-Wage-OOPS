package capgemini;

public class WageBuider {
	public static final int Present = 0;
	public static int a = 0;
	
	public static String attendence(){
		int check_attendence = (int)(Math.random()*2);
		if(check_attendence == Present)
			return "Employee is present";
			else {
				a = 1;
				return "Employee is absent"; 	
			}
	}
	
	public static int empWage(int empStatus) {
		int hours = 8;
		int wage = 20;
		if(empStatus == Present)
			return hours*wage;
		else
			return 0;				
	}
	
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program ");
	System.out.println(attendence() + " and the total wage of employee is: " + empWage(a));
	}
}
