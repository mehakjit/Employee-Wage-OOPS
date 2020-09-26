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
			return "Present";
		case Abscent:
			a=1;
			return "Abscent";	
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
	public static int Wage(int no_Of_Days,int max_no_of_hours) {
		int totalWage = 0;
		int hours=0;
		int day = 0;
		for(int i = 0;i<no_Of_Days;i++){
			while (hours<max_no_of_hours && day<no_Of_Days) {
			day += 1;
			System.out.println("Employee Attendence of Day " + day +" is: "+ attendence() + ";   Employe Type: " 
								+ employeeType(a) + ";   Employee Wage: " + empWage(a,b) );
			hours +=  (empWage(a,b)/20);
			totalWage += empWage(a, b);
			a=0;
			b=0;
			}
		}
		return totalWage;
	}

	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program ");
	System.out.println(Wage(20,100));
	}
}