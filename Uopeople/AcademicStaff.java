package Uopeople;

public class AcademicStaff extends Student implements StaffLogin {
   private double hourlyRate, hoursWorked, overtime, salaryAmount;
    String courses,lunchTicket;

    AcademicStaff(String firstName, String lastName, String idCard, String busTicket, String lunchTicket,String courses, double hourlyRate, double hoursWorked, double overtime) {
        super(firstName, lastName, idCard, busTicket, lunchTicket, courses);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtime = overtime;
        this.courses =courses;
    }

    public String getCourseName() {
        return "I will be teaching " + courses;
    }

    public String transportation() {
        double carDeduction = 1000, busTicketDeduction = 300, spend;
        spend = carDeduction - busTicketDeduction;
        return "Your transportation cost is $" + spend+".  After we cover $"+ busTicketDeduction +" of the $"+carDeduction;
    }
    public String cafeteria(){
        this.lunchTicket = lunchTicket;
        return "You are entitiled to a full course meal with ticket "+lunchTicket;
    }
    public double salary() {
        double overtimePay = 3 * hourlyRate;
        salaryAmount = (hourlyRate * hoursWorked) + (overtimePay * overtime);
        return salaryAmount;
    }

    public void staffLogin() {
        System.out.println("You can log into the staff portal");
    }


}

