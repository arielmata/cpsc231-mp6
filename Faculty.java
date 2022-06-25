/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** An abstract class that extends Affiliates and contains the details for a
Faculty object.
@author Ariel Gutierrez */
public abstract class Faculty extends Affiliates{
  /** Faculty ID number */
  protected int m_facultyID;
  /** Department that the faculty works in */
  protected String m_department;
  /** Yearly salary of the faculty */
  protected int m_yearlySalary;
  /** Number of papers that the faculty has published */
  protected int m_numPapers;

  /** Default Constructor: defaults m_facultyID, m_yearlySalary, and m_numPapers
  to -1, and defaults m_department to empty string,  as well as defaulting
  attributes from the class Affiliates that it extends. */
  public Faculty(){
    super();
    m_facultyID = -1;
    m_department = "";
    m_yearlySalary = -1;
    m_numPapers = -1;
  }

  /** Overloaded Constructor: sets all of the attributes for a Faculty object.
  @param n name of the affiliate
  @param age age of the affiliate
  @param add address of the affiliate
  @param p affiliate's phone number
  @param y year the affiliate arrived at chapman
  @param id faculty ID number
  @param d faculty department works in
  @param sal yearly salary of faculty
  @param nump number of papers published */
  public Faculty(String n, int age, String add, int p, int y, int id, String d,
      int sal, int nump){
    super(n,age,add,p,y);
    m_facultyID = id;
    m_department = d;
    m_yearlySalary = sal;
    m_numPapers = nump;
  }

  /** Copy Constructor: sets this faculty object's attributes to the same
  attributes from paramater.
  @param f Faculty object*/
  public Faculty(Faculty f){
    super(f.getName(),f.getAge(),f.getAddress(),f.getPhoneNum(),f.getYearArrived());
    m_facultyID = f.getFacultyID();
    m_department = f.getDepartment();
    m_yearlySalary = f.getYearlySalary();
    m_numPapers = f.getNumPapers();
  }

  /** This method returns the faculty ID number
  @return int value representing the faculty ID number */
  public int getFacultyID(){
    return m_facultyID;
  }

  /** This method returns the department the faculty works in
  @return String representing the department the faculty works in */
  public String getDepartment(){
    return m_department;
  }

  /** This method returns the yearly salary
  @return int representing yearly salary */
  public int getYearlySalary(){
    return m_yearlySalary;
  }

  /** This method returns the number of papers published
  @return int representing number of papers published */
  public int getNumPapers(){
    return m_numPapers;
  }

  /** This method sets m_facultyID
  @param id faculty ID number */
  public void setFacultyID(int id){
    m_facultyID = id;
  }

  /** This method sets m_department
  @param d department of faculty */
  public void setDepartment(String d){
    m_department = d;
  }

  /** This method sets m_yearlySalary
  @param sal yearly salary of faculty */
  public void setYearlySalary(int sal){
    m_yearlySalary = sal;
  }

  /** This method sets m_numPapers
  @param nump number of papers published */
  public void setNumPapers(int nump){
    m_numPapers = nump;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Faculty ID: " + m_facultyID);
    System.out.println("Department: " + m_department);
    System.out.println("Yearly Salary: " + m_yearlySalary);
    System.out.println("Number of Papers: " + m_numPapers);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return super.commaSeperated() + "," + m_department + "," + m_facultyID +
        "," + m_numPapers + "," + m_yearlySalary;
  }
}
