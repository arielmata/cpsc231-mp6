/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** A class that extends Faculty and contains the details for a
AssistantProfessors object.
@author Ariel Gutierrez*/
public class AssistantProfessors extends Faculty{
  /** Number of years to tenure */
  protected int m_yearsToTenure;

  /** Default Constructor: defaults m_yearsToTenure to -1, as well as defaulting
  attributes from the class Faculty that it extends. */
  public AssistantProfessors(){
    super();
    m_yearsToTenure = -1;
  }

  /** Overloaded Constructor: sets all fo the attributes for a AssistantProfessors
  object.
  @param n name of the affiliate
  @param age age of the affiliate
  @param add address of the affiliate
  @param p affiliate's phone number
  @param y year the affiliate arrived at chapman
  @param id faculty ID number
  @param d faculty department works in
  @param sal yearly salary of faculty
  @param nump number of papers published
  @param tenure years to tenure */
  public AssistantProfessors(String n, int age, String add, int p, int y, int id,
      String d, int sal, int nump, int tenure){
    super(n,age,add,p,y,id,d,sal,nump);
    m_yearsToTenure = tenure;
  }

  /** Copy Constructor: sets this AssistantProfessors object's attributes to
  the same attributes from parameter.
  @param a AssistantProfessors object*/
  public AssistantProfessors(AssistantProfessors a){
    super(a.getName(),a.getAge(),a.getAddress(),a.getPhoneNum(),a.getYearArrived(),
        a.getFacultyID(),a.getDepartment(),a.getYearlySalary(),a.getNumPapers());
    m_yearsToTenure = a.getYearsToTenure();
  }

  /** This method returns the number of years to tenure
  @return int representing number of years to tenure */
  public int getYearsToTenure(){
    return m_yearsToTenure;
  }

  /** This method sets m_yearsToTenure
  @param tenure number of years to tenure */
  public void getYearsToTenure(int tenure){
    m_yearsToTenure = tenure;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Years to Tenure: " + m_yearsToTenure);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables after class object name: AssistantProfessors.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return "AssistantProfessors" + "," + super.commaSeperated() + "," + m_yearsToTenure;
  }
}
