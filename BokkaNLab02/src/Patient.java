/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author s571697 Bokka Alekhya
 */
public class Patient {

   private int patientId;
    private String patientName;
    private int daysOfStay;
    private double dayCost;
    {
        patientId = 1;
        patientName = "Jack";
        daysOfStay = 0;
        dayCost = 0.0;
    }
    public Patient(int patientId, String patientName, int daysOfStay, double dayCost) {
       this.patientId = patientId;
       this.patientName = patientName;
       this.daysOfStay = daysOfStay;
       this.dayCost = dayCost;        
    }
    //getter  method
    public int getpatientId()
    {
        return patientId; 
    }
      public String getpatientName(){
            return patientName;
     }
    public int getdaysOfStay(){
        return daysOfStay;
    }
    public double getdayCost(){
        return dayCost;
    }
    //setter method
    public void setpatientId(int patientId)
    {
        this.patientId = patientId; 
    }
      public void setpatientName(String patientName){
            this.patientName = patientName;
     }
    public void setdaysOfStay(int daysOfStay){
        this.daysOfStay = daysOfStay;
    }
    public void setdayCost(double dayCost){
        this.dayCost = dayCost;
    }
    public double calculateTotalPrice(){
        return daysOfStay * dayCost;
    }
    
}
