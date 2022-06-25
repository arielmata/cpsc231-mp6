/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** A class that extends the abstract class Staff and contains
all the details for a PartTime object
@author Ariel Gutierrez*/
public class PartTime extends Staff{
  /** Hourly salary of the part time staff */
  protected double m_hourlySalary;

  /** Default Constructor: defaults m_hourlySalary to -1.0, as well as defaulting
  attributes from the class Staff that it extends. **/
  public PartTime(){
    super();
    m_hourlySalary = -1.0;
  }

  /** Overloaded Constructor: sets all of PartTime object's attributes.
  @param n name of the staff
  @param age age of the staff
  @param add address of the Staff
  @param p phone number of the Staff
  @param y year that the staff arrived at Chapman
  @param id staff ID Number
  @param t title of the Staff
  @param b building that the staff works in
  @param sal hourly salary **/
  public PartTime(String n, int age, String add, int p, int y, int id, String t,
      String b, double sal){
    super(n,age,add,p,y,id,t,b);
    m_hourlySalary = sal;
  }

  /** Copy Constructor: sets this PartTime object's attributes to the same
  attributes from paramater.
  @param p PartTime object **/
  public PartTime(PartTime p){
    super(p.getName(),p.getAge(),p.getAddress(),p.getPhoneNum(),p.getYearArrived(),p.getStaffID(),p.getTitle(),p.getBuilding());
    m_hourlySalary = p.getHourlySalary();
  }

  /** This method returns the hourly salary of the part time staff
  @return double value representing hourly salary */
  public double getHourlySalary(){
    return m_hourlySalary;
  }

  /** This method sets m_hourlySalary
  @param sal hourly salary of the part time staff */
  public void setHourlySalary(double sal){
    m_hourlySalary = sal;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Hourly Salary: " + m_hourlySalary);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables after class object name: PartTime.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return "PartTime" + "," + super.commaSeperated() + "," + m_hourlySalary;
  }
}
