/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** A class that extends Student and contains the details for a
Graduate object.
@author Ariel Gutierrez*/
public class Graduate extends Student{
  /** Number of papers published */
  protected int m_numPapers;
  /** Name of the graduate's thesis advisor*/
  protected String m_thesisAdvisor;

  /** Default Constructor: defaults m_numPapers to -1 and m_thesisAdvisor to
  empty string, as well as defaulting attributes from the class Student that
  it extends. */
  public Graduate(){
    super();
    m_numPapers = -1;
    m_thesisAdvisor = "";
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
  @param nump number of papers published
  @param thesis name of thesis advisor */
  public Graduate(String n, int age, String add, int p, int y, int id, String major, String minor, String cs, int nump, String thesis){
    super(n,age,add,p,y,id,major,minor,cs);
    m_numPapers = nump;
    m_thesisAdvisor = thesis;
  }

  /** Copy Constructor:  sets this Graduate object's attributes to the same
  attributes from paramater.
  @param g Graduate object */
  public Graduate(Graduate g){
    super(g.getName(),g.getAge(),g.getAddress(),g.getPhoneNum(),g.getYearArrived(),
        g.getStudentID(),g.getMajor(),g.getMinor(),g.getClassStanding());
    m_numPapers = g.getNumPapers();
    m_thesisAdvisor = g.getThesisAdvisor();
  }

  /** This method returns the number of papers published
  @return int value representing the number of papers published */
  public int getNumPapers(){
    return m_numPapers;
  }

  /** This method returns the name of the thesis advisory
  @return String representing the name of the thesis advisor */
  public String getThesisAdvisor(){
    return m_thesisAdvisor;
  }

  /** This method sets m_numPapers
  @param nump number of papers published */
  public void setNumPapers(int nump){
    m_numPapers = nump;
  }

  /** This method sets m_thesisAdvisor
  @param thesis name of the thesis advisor */
  public void setThesisAdvisor(String thesis){
    m_thesisAdvisor = thesis;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    super.print();
    System.out.println("Number of Papers: " + m_numPapers);
    System.out.println("Thesis Advisory: " + m_thesisAdvisor);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables after class object name: Graduate.
  @return String containing attributes in alphabetical order seperated by commas*/
  @Override
  public String commaSeperated(){
    return "Graduate," + super.commaSeperated() + "," + m_numPapers + "," + m_thesisAdvisor;
  }
}
