
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author s571697 Bokka Alekhya
 */
public class TestDriver {

    public static void main(String[] args) {
        // Patient details
        Patient pnt = new Patient(62735, "Jack", 3, 190.5);
        System.out.println("Patient Id : " + pnt.getpatientId());
        System.out.println("Patient Name : " + pnt.getpatientName());
        System.out.println("Number of days stayed in hospital : " + pnt.getdaysOfStay());
        System.out.println("The price for one day is $" + pnt.getdayCost());
        System.out.println("The total price for the stay is $"  + pnt.calculateTotalPrice());
        System.out.println(" ");
        System.out.println(" ");
        //doctor details
        Doctor doct = new Doctor(564, "charlie ", 4 , 30000.0);
        System.out.println("Doctor ID :" +doct.getdoctorId());
        System.out.println("Doctor Name :" +doct.getdoctorName());
        System.out.println("Number of patients assigned :" +doct.getpatientAssigned());
        System.out.println("The monthly salary is $" +doct.getsalaryPerMonth());
        System.out.println("The annual salary is $" +doct.calculateAnnualSalary());
        System.out.println(" ");
        System.out.println(" ");
        //block details
        Block b1 = new Block(8320, "cardiology Block", "John");
        System.out.println("Block Id :" + b1.getblockId());
        System.out.println("Patient Name :" + b1.getblockName());
        System.out.println("The Dean of " + b1.getblockName() + " is " +b1.getdean());
        System.out.println(" ");
        System.out.println(" ");
        //visitor details
        Visitor vit = new Visitor ("Mary ", 48563 , "Tuesday", 5);
        System.out.println("Name of the visitor : " +vit.getVisitorName());
        System.out.println("Day Visited : " +vit.getvisitDay());
        System.out.println(" Hours visited :" + vit.getvisitHours());
        System.out.println("Mary has visited the patient with the patient Id " + vit.getpatientId()+ " for " + vit.getvisitHours()+ " hours");
        
    }
    
    
}
