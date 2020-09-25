package capgemini;

public class WageBuider {
	public static String attendence(){
		int check_attendence = (int)(Math.random()*2);
		if(check_attendence==0)
			return "Employee is present ";
			else
			return "Employee is absent ";		
	}
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program ");
	String status = WageBuider.attendence();
	System.out.println(status);
	}
}
