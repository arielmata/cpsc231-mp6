/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** A class that extends Student and contains the details for a
Undergrad object.
@author Ariel Gutierrez */
public class Undergrad extends Student{
  /** Number of courses taken */
  protected int m_numCourses;
  /** Scholarship Amount of undergrad */
  protected int m_scholarshipAmount;

  /** Default Constructor: defaults m_numCourses and m_scholarshipAmount to -1,
  as well as defaulting attributes from the class Student that it extends. */
  public Undergrad(){
    super();
    m_numCourses = -1;
    m_scholarshipAmount = -1;
  }

  /** Overloaded Constructor : sets all of Student object's attributes.
  @param n name of the student
  @param age age of the student
  @param add address of the student
  @param p undergrad's phone number
  @param y year the student arrived at chapman
  @param id student ID number
  @param major major of the student
  @param minor minor of the student
  @param cs class standing of the student
  @param numc number of courses taken
  @param scholar scholarship amount*/
  public Undergrad(String n, int age, String add, int p, int y, int id,
      String major, String minor, String cs, int numc, int scholar){
    super(n,age,add,p,y,id,major,minor,cs);
    m_numCourses = numc;
    m_scholarshipAmount = scholar;
  }

  /** Copy Constructor:  sets this Undergrad object's attributes to the same
  attributes from paramater.
  @param u Undergrad object */
  public Undergrad(Undergrad u){
    super(u.getName(),u.getAge(),u.getAddress(),u.getPhoneNum(),u.getYearArrived(),
        u.getStudentID(),u.getMajor(),u.getMinor(),u.getClassStanding());
    m_numCourses = u.getNumCourses();
    m_scholarshipAmount = u.getScholarshipAmount();
  }

  /** This method returns the number of courses taken
  @return int value representing the number of courses */
  public int getNumCourses(){
    return m_numCourses;
  }

  /** This method returns the scholarship amount recieved
  @return int value representing the scholarship amount recieved*/
  public int getScholarshipAmount(){
    return m_scholarshipAmount;
  }

  /** This method sets m_numCourses
  @param numc number of courses taken*/
  public void setNumCourses(int numc){
    m_numCourses = numc;
  }

  /** This method sets m_scholarshipAmount
  @param scholar scholarship amount recieved */
  public void setScholarshipAmount(int scholar){
    m_scholarshipAmount = scholar;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Number of Courses: " + m_numCourses);
    System.out.println("Scholarship Amount: " + m_scholarshipAmount);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables after class object name: Undergrad.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return "Undergrad," + super.commaSeperated() + "," + m_numCourses + "," + m_scholarshipAmount;
  }
}
