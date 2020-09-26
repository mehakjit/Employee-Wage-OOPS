package capgemini;

public class WageBuider {
	public static final int Present = 0;
	public static final int Abscent = 1;
	public static final int Full_Time = 0;
	public static final int Half_Time = 1;
	public static int a = 0;
	public static int b = 0;

	public static String attendence(){
		int check_attendence = (int)(Math.random()*2);
		switch(check_attendence) {
		case Present:
			return "Employee is present";
		case Abscent:
			a=1;
			return "Employee is absent";	
		}
	return "dchusuygfuyws";
	}

	public static String employeeType(int empStatus) {
		switch (empStatus) {
		case Present:
			int TypeOfEmployee = (int)(Math.random()*2);
				switch (TypeOfEmployee) {
				case Full_Time:
					return"Full Time "; 
				case Half_Time:
					b=1;
					return "Half Time "; 
				}
			break;
		case Abscent:
			return("-NA- ");
	}
		return " ush";}

	public static int empWage(int empStatus, int empType) {
		int hours = 8;
		int wage = 20;
		switch(empStatus) {
		case Present:
			switch (empType) {
			case Full_Time:
				return hours*wage;
			case Half_Time:
				return hours*wage/2;
		}
		case Abscent:
			return 0;}
		return 0;
	}


	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program ");
	System.out.println("Employee Attendence: " + attendence() + ";   Employe Type: " + employeeType(a) + ";   Employee Wage: " + empWage(a,b));
	}
}