/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** A class that extends Faculty and contains the details for a
AssociateProfessors object
@author Ariel Gutierrez*/
public class AssociateProfessors extends Faculty{
  /** Number of years since tenure*/
  protected int m_yearsSinceTenure;

  /** Default Constructor: defaults m_yearsSinceTenure to -1, as well as
  defaulting attributes from the class Faculty that it extends. */
  public AssociateProfessors(){
    super();
    m_yearsSinceTenure = 0;
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
  @param tenure years since tenure */
  public AssociateProfessors(String n, int age, String add, int p, int y, int id,
      String d, int sal, int nump, int tenure){
    super(n,age,add,p,y,id,d,sal,nump);
    m_yearsSinceTenure = tenure;
  }

  /** Copy Constructor: sets this AssociateProfessors object's attributes to
  the same attributes from parameter.
  @param a AssociateProfessors object*/
  public AssociateProfessors(AssociateProfessors a){
    super(a.getName(),a.getAge(),a.getAddress(),a.getPhoneNum(),a.getYearArrived(),
        a.getFacultyID(),a.getDepartment(),a.getYearlySalary(),a.getNumPapers());
    m_yearsSinceTenure = a.getYearsSinceTenure();
  }

  /** This method returns the number of years since tenure
  @return int representing number of years since tenure */
  public int getYearsSinceTenure(){
    return m_yearsSinceTenure;
  }

  /** This method sets m_yearsSinceTenure
  @param tenure number of years since tenure */
  public void setYearsSinceTenure(int tenure){
    m_yearsSinceTenure = tenure;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Years since Tenure: " + m_yearsSinceTenure);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables after class object name: AssociateProfessors.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return "AssociateProfessors" + "," + super.commaSeperated() + "," + m_yearsSinceTenure;
  }
}
