package capgemini;

public class WageBuider {
	public static final int PRESENT = 0;
	public static final int Abscent = 1;
	public static final int Full_Time = 0;
	public static final int Half_Time = 1;
	public static int a = 0;
	public static int b = 0;

	public static String attendence(){
		int check_attendence = (int)(Math.random()*2);
		switch(check_attendence) {
		case PRESENT:
			return "Present";
		case Abscent:
			a=1;
			return "Abscent";	
		}
	return "dchusuygfuyws";
	}

	public static String employeeType(int empStatus) {
		switch (empStatus) {
		case PRESENT:
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

	public static int empWage(int empStatus, int empType ,int empWage) {
		int hours = 8;
		switch(empStatus) {
		case PRESENT:
			switch (empType) {
			case Full_Time:
				return hours*empWage;
			case Half_Time:
				return hours*empWage/2;
		}
		case Abscent:
			return 0;}
		return 0;
	}
	public String Wage(String company,int no_Of_Days,int max_no_of_hours,int empWage) {
		int totalWage = 0;
		int hours=0;
		int day = 0;
		for(int i = 0;i<no_Of_Days;i++){
			while (hours<max_no_of_hours && day<no_Of_Days) {
			day += 1;
			System.out.println("Company: " + company + ";   Day: " + day +";   Attendence: "+ attendence() + ";   Employe Type: " 
								+ employeeType(a) + ";   Employee Wage: " + empWage(a,b,empWage) );
			hours +=  (empWage(a,b,empWage)/empWage);
			totalWage += empWage(a, b,empWage);
			a=0;
			b=0;
			}
		}
		return "Total Wage: " + totalWage;
	}


	}
