package capgemini;

public class WageBuider {
	public static final int Present = 0;
	public static final int Full_Time = 0;
	public static int a = 0;
	public static int b = 0;
	
	public static String attendence(){
		int check_attendence = (int)(Math.random()*2);
		if(check_attendence == Present)
			return "Present";
			else {
				a = 1;
				return "Absent"; 	
			}
	}
	
	public static String employeeType(int empStatus) {
		if (empStatus == Present){
		int TypeOfEmployee = (int)(Math.random()*2);
		if (TypeOfEmployee==Full_Time)
			return "Full Time ";
		else {
			b=1;
			return "Half Time ";
		}}
		else
			return "-NA- ";
	}
	
	public static int empWage(int empStatus, int empType) {
		int hours = 8;
		int wage = 20;
		if(empStatus == Present) {
			if (empType == Full_Time)
				return hours*wage;
			else
				return hours*wage/2;
		}
		else
			return 0;
	}
	

	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program ");
	System.out.println("Employee Attendence: " + attendence() + " Employe Type: " + employeeType(a) + " Employee Wage: " + empWage(a,b));
	}
}
