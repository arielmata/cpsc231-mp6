/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** An abstract class that extends Affiliates and contains the details for a
Student object.
@author Ariel Gutierrez*/
public abstract class Student extends Affiliates{
  /** Student ID number */
  protected int m_studentID;
  /** Major of the student */
  protected String m_major;
  /** Minor of the student */
  protected String m_minor;
  /** Class Standing of the student */
  protected String m_classStanding;

  /** Default Constructor: defaults m_studentID to -1, and defaults m_major,
  m_minor, and m_classStanding to empty string, as well as defaulting attributes from the class Affiliates
  that it extends. */
  public Student(){
    super();
    m_studentID = -1;
    m_major = "";
    m_minor = "";
    m_classStanding = "";
  }

  /** Overloaded Constructor : sets all of Student object's attributes.
  @param n name of the student
  @param age age of the student
  @param add address of the student
  @param p student's phone number
  @param y year the student arrived at chapman
  @param id student ID number
  @param major major of the student
  @param minor minor of the student
  @param cs class standing of the student */
  public Student(String n, int age, String add, int p, int y, int id, String major, String minor, String cs){
    super(n,age,add,p,y);
    m_studentID = id;
    m_major = major;
    m_minor = minor;
    m_classStanding = cs;
  }

  /** Copy Constructor:  sets this Student object's attributes to the same
  attributes from paramater.
  @param s Student object */
  public Student(Student s){
    super(s.getName(),s.getAge(),s.getAddress(),s.getPhoneNum(),s.getYearArrived());
    m_studentID = s.getStudentID();;
    m_major = s.getMajor();;
    m_minor = s.getMinor();
    m_classStanding = s.getClassStanding();
  }

  /** This method returns the student ID number
  @return int value representing the student ID number */
  public int getStudentID(){
    return m_studentID;
  }

  /** This method returns major of the student
  @return String representing the major */
  public String getMajor(){
    return m_major;
  }

  /** This method returns minor of the student
  @return String representing the minor */
  public String getMinor(){
    return m_minor;
  }
  /** This method returns class standing of the student
  @return String representing the class standing */
  public String getClassStanding(){
    return m_classStanding;
  }

  /** This method sets m_studentID
  @param id student ID number */
  public void setStudentID(int id){
    m_studentID = id;
  }

  /** This method sets m_major
  @param major major of the student */
  public void setMajor(String major){
    m_major = major;
  }

  /** This method sets m_minor
  @param minor minor of the student */
  public void setMinor(String minor){
    m_minor = minor;
  }

  /** This method sets m_classStanding
  @param cs class standing of the student */
  public void setClassStanding(String cs){
    m_classStanding = cs;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Student ID: " + m_studentID);
    System.out.println("Major: " + m_major);
    System.out.println("Minor: " + m_minor);
    System.out.println("Class Standing: " + m_classStanding);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return super.commaSeperated() + "," + m_classStanding + "," + m_major + "," + m_minor + "," + m_studentID;
  }
}
