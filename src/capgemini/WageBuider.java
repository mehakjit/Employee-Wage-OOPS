package capgemini;

import java.util.ArrayList;

public class WageBuider {
	public static final int PRESENT = 0;
	public static final int Full_Time = 0;
	public static final int Half_Time = 1;
	public static int tempStaus = 0;
	public static int tempType = 0;

		public ArrayList<Company> list = new ArrayList<Company>(); 
		
		public void addCompany(String company, int empRatePerHour, int maxDays, int maxHours) {
			Company c = new  Company(company, empRatePerHour, maxDays, maxHours);
			list.add(c);
			c.setTotalWage(Wage(company, maxHours , maxDays, empRatePerHour));
			System.out.println(c);
		}
		public String attendence(){
		int check_attendence = (int)(Math.random()*2);
		switch(check_attendence) {
		case PRESENT:
			return "Present";
		default :
			tempStaus=1;
			return "Abscent";	
		}
	
	}

	public String employeeType(int empStatus) {
		switch (empStatus) {
		case PRESENT:
			int TypeOfEmployee = (int)(Math.random()*2);
				switch (TypeOfEmployee) {
				case Full_Time:
					return "Full Time "; 
				case Half_Time:
					tempType=1;
					return "Half Time "; 
				}
		default :
			return "-NA- ";
	}
		}

	public int empWage(int empStatus, int empType ,int empWage) {
		int hours = 8;
		switch(empStatus) {
		case PRESENT:
			switch (empType) {
			case Full_Time:
				return hours*empWage;
			case Half_Time:
				return hours*empWage/2;
		}
		default :
			return 0;}
	}
	public int Wage(String company,int no_Of_Days,int max_no_of_hours,int empWage) {
		int totalWage = 0;
		int hours=0;
		int day = 0;
		for(int i = 0;i<no_Of_Days;i++){
			while (hours<max_no_of_hours && day<no_Of_Days) {
			day += 1;
			System.out.println("Company: " + company + ";   Day: " + day +";   Attendence: "+ attendence() + ";   Employe Type: " 
								+ employeeType(tempStaus) + ";   Employee Wage: " + empWage(tempStaus,tempType,empWage) );
			hours +=  (empWage(tempStaus,tempType,empWage)/empWage);
			totalWage += empWage(tempStaus, tempType,empWage);
			tempStaus=0;
			tempType=0;
			}
		}
		return totalWage;
	}
}
