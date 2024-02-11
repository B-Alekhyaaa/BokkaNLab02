/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author s571697 Bokka ALekhya
 */
public class Doctor {

   private int doctorId;
    private String doctorName;
    private int patientAssigned;
    private double salaryPerMonth;
    double asal;
    
    public Doctor(){
        doctorId = 1;
        doctorName = "unknown";
        patientAssigned = 0;
        salaryPerMonth = 0.0;
    }
   public Doctor(int doctorId , String doctorName , int patientAssigned , double salaryPerMonth)
   {
       this.doctorId = doctorId;
       this.doctorName = doctorName;
       this.patientAssigned = patientAssigned;
       this.salaryPerMonth = salaryPerMonth;
   }
   //getter method
   public int getdoctorId(){
       return doctorId;
   }
   public String getdoctorName() {
       return doctorName;
   }
   public int getpatientAssigned(){
       return patientAssigned;
   }
   public double getsalaryPerMonth() {
       return salaryPerMonth;
   }
   //setter method
   public void setdoctorId(int doctorId){
       this.doctorId = doctorId;
   }
   public void setdoctorName(String doctorName){
       this.doctorName = doctorName;
   }
   public void setpatientAssigned(int patientAssigned){
       this.patientAssigned = patientAssigned;
   }
   public void setsalaryPerMonth(double salaryPerMonth){
       this.salaryPerMonth = salaryPerMonth;
   }
   public double calculateAnnualSalary()
   {
       asal = salaryPerMonth * 12;
       return asal;
   }
   
}

