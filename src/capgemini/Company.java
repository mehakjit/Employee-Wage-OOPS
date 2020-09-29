package capgemini;

public class Company {
	
	public String company;
	int empRatePerHour;
	int maxDays;
	int maxHours;
	int TotalWage;
	
	public int getTotalWage() {
		return TotalWage;
	}
	public void setTotalWage(int totalWage) {
		TotalWage = totalWage;
	}
	public Company(String company, int empRatePerHour, int maxDays, int maxHours) {
		
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.maxDays = maxDays;
		this.maxHours = maxHours;

	}
	@Override
	public String toString() {
		return "Company [company=" + company + ", empRatePerHour=" + empRatePerHour + ", maxDays=" + maxDays
				+ ", maxHours=" + maxHours + ", TotalWage=" + TotalWage + "]";
	}

}
