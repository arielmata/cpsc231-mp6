/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

/** An abstract class that implements Comparable<Affiliates> and Prinatable, and contains
the details for an Affiliates object.
@author Ariel Gutierrez*/
public abstract class Affiliates implements Comparable<Affiliates>, Printable{
  /** Name of the Affiliate */
  protected String m_name;
  /** Age of the Affiliate */
  protected int m_age;
  /** Address of the Affiliate */
  protected String m_address;
  /** Phone number of the Affiliate */
  protected int m_phoneNum;
  /** The year the Affiliate arrived */
  protected int m_yearArrived;

  /** Default Constructor: sets m_name, m_address to empty string, sets m_age,
  m_phoneNum, m_yearArrived to -1. **/
  public Affiliates(){
    m_name = "";
    m_age = -1;
    m_address = "";
    m_phoneNum = -1;
    m_yearArrived = -1;
  }

  /** Overloaded Constructor: sets all of Affiliates attributes, i.e
  sets m_name to n, m_age to age, m_address to add, m_phoneNum to p,
  m_yearArrived to y.
  @param n name of the affiliate
  @param age age of the affiliate
  @param add address of the affiliate
  @param p affiliate's phone number
  @param y year the affiliate arrived at chapman */
  public Affiliates(String n, int age, String add, int p, int y){
    m_name = n;
    m_age = age;
    m_address = add;
    m_phoneNum = p;
    m_yearArrived = y;
  }

  /** Copy Constructor: sets m_name, m_age, m_address, m_phoneNum, and
  m_yearArrived to the same attributes as attribute given in parameter.
  @param a Affiliate object **/
  public Affiliates(Affiliates a){
    m_name = a.getName();
    m_age = a.getAge();
    m_address = a.getAddress();
    m_phoneNum = a.getPhoneNum();
    m_yearArrived = a.getYearArrived();
  }

  /** This method returns the Affiliate's name
  @return String representing name of affiliate */
  public String getName(){
    return m_name;
  }
  /** This method returns the Affiliate's age
  @return int value representing the age of the affiliate */
  public int getAge(){
    return m_age;
  }
  /** This method returns the Affiliate's address
  @return String representing address of the affiliate */
  public String getAddress(){
    return m_address;
  }
  /** This method returns the Affiliate's phone number
  @return int value representing the phone number of the affiliate */
  public int getPhoneNum(){
    return m_phoneNum;
  }
  /** This method returns the year the affiliate arrived
  @return int value representing year the affiliate arrived at chapman */
  public int getYearArrived(){
    return m_yearArrived;
  }

  /** This method sets m_name
  @param n name of the affiliate */
  public void setName(String n){
    m_name = n;
  }

  /** This method sets m_age
  @param age age of the affiliate */
  public void setAge(int age){
    m_age = age;
  }

  /** This method sets m_address
  @param add address of the affiliate */
  public void setAddress(String add){
    m_address = add;
  }

  /** This method sets m_phoneNum
  @param p phone number of the affiliate */
  public void setPhoneNum(int p){
    m_phoneNum = p;
  }

  /** This method sets m_yearArrived
  @param y year the affiliate arrived to chapman */
  public void setYearArrived(int y){
    m_yearArrived = y;
  }

  /** This method compares object Affiliates to each other.
  return 0 if arrived at chapman at same year (equal seniority)
  returns -1 if this has been at Chapman longer than a
  returns 1 if this has been at chapman less than a
  @param a affiliate object you wish to compare this to
  @return integer from -1 to 1 that represents the comparison to another affiliate*/
  @Override
  public int compareTo(Affiliates a){
    int ret;
    if(this.m_yearArrived < a.getYearArrived()){
      ret = -1;
    } else if(this.m_yearArrived > a.getYearArrived()){
      ret = 1;
    } else{
      ret = 0;
    }
    return ret;
  }

  /** This method prints all information associated with the class instance. */
  @Override
  public void print(){
    System.out.println("Name: " + m_name);
    System.out.println("Address: " + m_address);
    System.out.println("Phone Number: " + m_phoneNum);
    System.out.println("Year arrived to Chapman: " + m_yearArrived);
  }

  /** This method returns a comma comma seperated string that contains the
  attributes of the affiliate in alphabetical order according to the name of
  the variables.
  @return String containing attributes in alphabetical order seperated by commas*/
  public String commaSeperated(){
    return m_address + "," + m_age + "," + m_name + "," + m_phoneNum + "," + m_yearArrived;
  }
}
