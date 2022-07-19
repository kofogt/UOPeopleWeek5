package Uopeople;

public class Student extends School{
   private String courses, instructorName, busTicket, lunchTicket;
    Student(String firstName, String lastName, String idCard, String busTicket, String lunchTicket, String courses){
        super( firstName, lastName,  idCard);
        this.busTicket = busTicket;
        this.lunchTicket=lunchTicket;
        this.courses = courses;
    }
    public String getCourseName(){
       return "The course name is "+ courses;
    }
    public String transportation(){
        this.busTicket = busTicket;
        return "Your ticket type is"+ busTicket;
    }
    public String cafeteria(){
        this.lunchTicket = lunchTicket;
        return "You are entitiled to one meal with ticket "+lunchTicket;
    }
}
