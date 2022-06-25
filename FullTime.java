/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** A class that extends the abstract class Staff and contains
all the details for a FullTime object
@author Ariel Gutierrez*/
public class FullTime extends Staff{
  /** Yearly salary of the full time staff */
  protected int m_yearlySalary;

  /** Default Constructor: defaults m_yearlySalary to -1, as well as defaulting
  attributes from the class Staff that it extends. **/
  public FullTime(){
    super();
    m_yearlySalary = -1;
  }

  /** Overloaded Constructor: sets all of ParTime object's attributes.
  @param n name of the staff
  @param age age of the staff
  @param add address of the Staff
  @param p phone number of the Staff
  @param y year that the staff arrived at Chapman
  @param id staff ID Number
  @param t title of the Staff
  @param b building that the staff works in
  @param sal yearly salary **/
  public FullTime(String n, int age, String add, int p, int y, int id, String t,
      String b, int sal){
    super(n,age,add,p,y,id,t,b);
    m_yearlySalary = sal;
  }

  /** Copy Constructor: sets this FullTime object's attributes to the same
  attributes from paramater.
  @param f FullTime object **/
  public FullTime(FullTime f){
    super(f.getName(),f.getAge(),f.getAddress(),f.getPhoneNum(),f.getYearArrived(),
        f.getStaffID(),f.getTitle(),f.getBuilding());
    m_yearlySalary = f.getYearlySalary();
  }

  /** This method returns the yearly salary of the full time staff
  @return int representing the yearly salary */
  public int getYearlySalary(){
    return m_yearlySalary;
  }

  /** This method sets m_yearlySalary
  @param sal yearly salary of the full time staff */
  public void setYearlySalary(int sal){
    m_yearlySalary = sal;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Yearly Salary: " + m_yearlySalary);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables after class object name: FullTime.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return "FullTime," + super.commaSeperated() + "," + m_yearlySalary;
  }
}
