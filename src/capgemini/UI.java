package capgemini;

public interface UI {
	 String employeeType(int empStatus);
	 void addCompany(String company, int empRatePerHour, int maxDays, int maxHours);
	 String attendence();
	 int empWage(int empStatus, int empType ,int empWage);
	}
