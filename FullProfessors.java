/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** A class that extends Faculty and contains the details for a
FullProfessors object.
@author Ariel Gutierrez*/
public class FullProfessors extends Faculty{
  /** Years until retirement */
  protected int m_yearsUntilRetirement;

  /** Default Constructor: defaults m_yearsUntilRetirement to -1, as well as
  defaulting attributes from the class Faculty that it extends. */
  public FullProfessors(){
    super();
    m_yearsUntilRetirement = 0;
  }

  /** Overloaded Constructor: sets all fo the attributes for a FullProfessors
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
  @param retire years until retirement */
  public FullProfessors(String n, int age, String add, int p, int y, int id,
      String d, int sal, int nump, int retire){
    super(n,age,add,p,y,id,d,sal,nump);
    m_yearsUntilRetirement = retire;
  }

/** Copy Constructor: sets this FullProfessors object's attributes to
the same attributes from parameter.
@param f FullProfessors object*/
  public FullProfessors(FullProfessors f){
    super(f.getName(),f.getAge(),f.getAddress(),f.getPhoneNum(),f.getYearArrived(),
        f.getFacultyID(),f.getDepartment(),f.getYearlySalary(),f.getNumPapers());
    m_yearsUntilRetirement = f.getYearsUntilRetirement();
  }

  /** This method returns the number of years until retirement
  @return int representing number of years until retirement */
  public int getYearsUntilRetirement(){
    return m_yearsUntilRetirement;
  }

  /** This method sets m_yearsUntilRetirement
  @param retire number of years until retirement*/
  public void setYearsUntilRetirement(int retire){
    m_yearsUntilRetirement = retire;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Years until Retirement: " + m_yearsUntilRetirement);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables after class object name: FullProfessors.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return "FullProfessors" + "," + super.commaSeperated() + "," + m_yearsUntilRetirement;
  }
}
