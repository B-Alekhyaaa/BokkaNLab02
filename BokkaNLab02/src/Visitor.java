/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author s571697 Bokka Alekhya
 */
public class Visitor {


 private String visitorName;
    private int patientId;
    private String visitDay;
    private int visitHours;
    int displayHours;
    
    public Visitor(){
        visitorName = "unknown";
        patientId = 1;
        visitDay = "unknown";
        visitHours = 1;
    }
   public Visitor(String visitorName , int patientId , String visitDay,int visitHours)
   {
       this.visitorName = visitorName;
       this.patientId = patientId;
       this.visitDay = visitDay;
       this.visitHours = visitHours;
   }
   //Getter method
   public String getVisitorName(){
       return visitorName;
   }
   public int getpatientId() {
       return patientId;
   }
   public String getvisitDay(){
       return visitDay;
   }
   public int getvisitHours(){
       return visitHours;
   }
   //setter Method
   public void setVisitorName(String visitorName){
       this.visitorName = visitorName;
   }
   public void setpatientId(int patientId){
       this.patientId = patientId;
   }
   public void setvisitDay(String visitDay){
       this.visitDay = visitDay;
   }
   public void setvisitHours(int visitHours)
   {
       this.visitHours = visitHours;
   }
   public int displayHours()
   {
       displayHours = visitHours;
       return displayHours;
   }
}
    
