/*
Full name: Ariel Gutierrez
Student	ID: 2318163
Chapman	email: arigutierrez@chapman.edu
Course number	and	section: CPSC 231-03
Assignment or exercise number: Mastery Project 6
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.lang.NumberFormatException;
import java.io.*;

/** This class contains the main method that sets up database and runs program
for editing database.
@author Ariel Gutierrez */
public class AffiliatesDriver{
  /** This method tells us if a string can be parsed as a postive integer
  @param str string that we want to conver to int
  @return -1 if can't be parsed, o.w. returns parsed string parameter */
  private static int tryParse(String str){
    int parsed = -1;
    try{
      parsed = Integer.parseInt(str);
    } catch(NumberFormatException e){
      parsed = -1;
      System.err.println("Crap! You didn't enter an integer!");
    }
    return parsed;
  }

  /** This method prompts the user for an affiliate ID number until a positive
  integer is given.
  @param prompt question to prompt user
  @return integer value in response to prompt */
  private static int promptUser(String prompt){
    Scanner scnr = new Scanner(System.in);
    int userIn = -1;
    while(userIn == -1){
      System.out.println(prompt);
      userIn = tryParse(scnr.nextLine());
    }
    return userIn;
  }

  /** This method prints out the options to do in the program */
  private static void options(){
    System.out.println();
    System.out.println("Please pick one of the following options: (Enter integers only; 1-7)");
    System.out.println("1) Create an affiliate record");
    System.out.println("2) Print information for an Affiliate given the ID number");
    System.out.println("3) List all affiliates in order of seniority");
    System.out.println("4) Delete a record given the ID number");
    System.out.println("5) Save your database to a file");
    System.out.println("6) Restore your database from a file");
    System.out.println("7) Exit");
  }

  private static void optionOne(){

  }
  /** The main method is the driver for the program. Here the user is prompted
  with a question that asks them what they would like to do given seven options.
  Depending on which answer is chosen, the program will then prompts the user
  into getting the information it needs to complete the option. Once an option
  that the user selected is completed the program prompts the user for one of
  the seven options until the user wants to exit (option 7). */
  public static void main(String[] args){
    boolean isExiting = false;
    Scanner scnr = new Scanner(System.in);
    String userInput;
    int userTenure;
    AssistantProfessors ap = new AssistantProfessors();
    AssociateProfessors associatep = new AssociateProfessors();
    int userID;
    int userSalary;
    double userHSalary;
    int userNumPapers;
    String userAffiliate;
    HashMap<Integer, Affiliates> affiliatesMap = new HashMap<Integer, Affiliates>(); // HashMap that contains database of affiliates

    while (!isExiting){
      options(); // displays options available to user
      userInput = scnr.nextLine();
      switch (userInput){
        case "1":
          System.out.println("Enter the name of the affiliate:");
          String userName = scnr.nextLine();
          int userAge = promptUser("Enter the age of the affiliate:");
          System.out.println("Enter the address of the affiliate:");
          String userAddress = scnr.nextLine();
          int userPhone = promptUser("Enter the phone number of the affiliate:");
          int userYear = promptUser("Enter the year the affiliate arrived to Chapman:");

          System.out.println("Is the affiliate a 'student', 'faculty', or 'staff': ");
          userAffiliate = scnr.nextLine();
          boolean isAffiliate = false;
          while(!isAffiliate){
            switch (userAffiliate.toLowerCase()){
              case "faculty":
                isAffiliate = true;
                userID = promptUser("Enter the faculty ID number:");
                System.out.println("Enter the faculty's department:");
                String userDepartment = scnr.nextLine();
                userSalary = promptUser("Enter the faculty's yearly salary:");
                userNumPapers = promptUser("Enter the faculty's number of papers published:");

                System.out.println("Is the faculty an 'assistant', 'associate', or 'full' professor: ");
                String userFaculty = scnr.nextLine();
                boolean isFaculty = false;
                while(!isFaculty){
                  switch (userFaculty.toLowerCase()){
                    case "assistant":
                      isFaculty = true;
                      userTenure = promptUser("Enter the years until tenure:");
                      ap = new AssistantProfessors(userName,
                          userAge,userAddress,userPhone,userYear,userID,userDepartment,
                          userSalary,userNumPapers,userTenure);
                      affiliatesMap.put(userID, ap);
                      break;
                    case "associate":
                      isFaculty = true;
                      userTenure = promptUser("Enter the years since tenure:");
                      associatep = new AssociateProfessors(userName,
                          userAge,userAddress,userPhone,userYear,userID,userDepartment,
                          userSalary,userNumPapers,userTenure);
                      affiliatesMap.put(userID, ap);
                      break;
                    case "full":
                      isFaculty = true;
                      int userRetire = promptUser("Enter the years until retirement:");
                      FullProfessors fp = new FullProfessors(userName,userAge,
                          userAddress,userPhone,userYear,userID,userDepartment,
                          userSalary,userNumPapers,userRetire);
                      affiliatesMap.put(userID, fp);
                      break;
                    default:
                      System.out.println();
                      System.out.println("Entered wrong input. Please specify if the faculty is an 'assistant', 'associate', or 'full' professor:");
                      userFaculty = scnr.nextLine();
                  }
                }
              break;
              case "staff":
                isAffiliate = true;
                userID = promptUser("Enter the staff ID number:");
                System.out.println("Enter the staff's title:");
                String userTitle = scnr.nextLine();
                System.out.println("Enter the staff's building:");
                String userBuilding = scnr.nextLine();

                System.out.println("Is the staff a 'full' or 'part' time:");
                String userStaff = scnr.nextLine();
                boolean isStaff = false;
                while (!isStaff){
                  switch (userStaff.toLowerCase()){
                    case "full":
                      isStaff = true;
                      userSalary = promptUser("Enter the staff's yearly salary:");
                      FullTime ft = new FullTime(userName,userAge,userAddress,userPhone,
                      userYear,userID,userTitle,userBuilding,userSalary);
                      affiliatesMap.put(userID, ft);
                      break;
                    case "part":
                      isStaff = true;
                      boolean canParseDouble = false;
                      userHSalary = -1.0;
                      while (!canParseDouble){
                        try{
                          System.out.println("Enter the staff's hourly salary:");
                          userHSalary = Double.parseDouble(scnr.nextLine());
                          canParseDouble = true;
                        } catch(NumberFormatException e){
                          System.err.println("Crap! You did not enter a double!");
                          canParseDouble = false;
                        }
                      }
                      PartTime pt = new PartTime(userName,userAge,userAddress,
                          userPhone,userYear,userID,userTitle,userBuilding,userHSalary);
                      affiliatesMap.put(userID, pt);
                      break;
                    default:
                      System.out.println();
                      System.out.println("Entered wrong input. Please specify if the staff works 'full', or 'part' time:");
                      userStaff = scnr.nextLine();
                  }
                }
                break;
              case "student":
                isAffiliate = true;
                userID = promptUser("Enter the student ID number:");
                System.out.println("Enter the student's major:");
                String userMajor = scnr.nextLine();
                System.out.println("Enter the student's minor:");
                String userMinor = scnr.nextLine();
                System.out.println("Enter the student's class standing:");
                String userCS = scnr.nextLine();

                System.out.println("Is the student a 'graduate' or 'undergrad' student:");
                String userStudent = scnr.nextLine();
                boolean isStudent = false;
                while(!isStudent){
                  switch (userStudent.toLowerCase()){
                    case "graduate":
                      isStudent = true;
                      userNumPapers = promptUser("Enter the number of papers published:");
                      System.out.println("Enter the name of the student's thesis advisor:");
                      String userThesis = scnr.nextLine();
                      Graduate g = new Graduate(userName,userAge,userAddress,
                          userPhone,userYear,userID,userMajor,userMinor,userCS,
                          userNumPapers,userThesis);
                      affiliatesMap.put(userID,g);
                      break;
                    case "undergrad":
                      isStudent = true;
                      int userNumCourses = promptUser("Enter the number of courses taken:");
                      int userScholar = promptUser("Enter the student's scholarship amount:");
                      Undergrad ug = new Undergrad(userName,userAge,userAddress,
                          userPhone,userYear,userID,userMajor,userMinor,userCS,
                          userNumCourses,userScholar);
                      affiliatesMap.put(userID,ug);
                      break;
                    default:
                      System.out.println();
                      System.out.println("Entered wrong input. Please specify if the student is an 'undergrad' or a 'graduate':");
                      userStudent = scnr.nextLine();
                  }
                }
                break;
              default:
                System.out.println();
                System.out.println("Entered wrong input. Please enter if the affiliate is a 'student', 'faculty', or 'staff':");
                userAffiliate = scnr.nextLine();
            }
          }
          break;
        case "2": // Print information for an Affiliate given the id
          while(true){
            userID = promptUser("Enter the ID number:"); // This should check if user put an integer
            if (affiliatesMap.containsKey(userID)){
              Affiliates a = affiliatesMap.get(userID);
              a.print();
              break;
            } else{
              System.out.println("The database does not contain that ID number.");
            }
          }
          break;
        case "3": // List all affiliates in order of seniority (year they arrived means higher seniority)
          ArrayList<Affiliates> sortedList = new ArrayList<Affiliates>(affiliatesMap.values());
          Collections.sort(sortedList);
          for (int i = 0; i < sortedList.size(); ++i){
            System.out.println(sortedList.get(i).getName());
          }
          break;
        case "4": // Delete a record given the ID
          while(true){
            userID = promptUser("Enter the ID number:");
            if (affiliatesMap.containsKey(userID)){
              System.out.println("The affiliate, " + affiliatesMap.get(userID).getName() + ", has been removed from the database.");
              affiliatesMap.remove(userID);
              break;
            } else{
              System.out.println();
              System.out.println("The database does not contain that ID number.");
            }
          }
          break;
        case "5": // Save your database to a file
          boolean errorFree = false;
          while (!errorFree){
            System.out.println("Enter the desired output file (.txt):");
            String fileName = scnr.nextLine();
            if (!fileName.contains(".txt")){
              errorFree = false;
              continue;
            }
            try{
              PrintWriter pw = new PrintWriter(new FileWriter(fileName));
              for (Affiliates affil : affiliatesMap.values()){
                pw.println(affil.commaSeperated());
              }
              pw.close();
              errorFree = true;
            } catch(IOException e){
              System.err.println("Crap!");
              e.printStackTrace();
              errorFree = false;
            }
          }
          break;
        case "6": // Restore your database from a file
          boolean hasError = true;
          String fileName;
          while (hasError){
            System.out.println("Enter the desired input file (.txt):");
            fileName = scnr.nextLine();
            if (!fileName.contains(".txt")){
              hasError = true;
              System.out.println("Invalid. The file name is not a .txt file.");
              continue;
            }
            try{
              BufferedReader br = new BufferedReader(new FileReader(fileName));
              String line = "";
              while((line=br.readLine())!=null){
                String[] af = line.split(",");
                switch (af[0]){ // af[0] is the class the affiliate belongs to
                  case "AssistantProfessors":
                    ap = new AssistantProfessors(af[3],
                        Integer.parseInt(af[2]),af[1],Integer.parseInt(af[4]),
                        Integer.parseInt(af[5]),Integer.parseInt(af[7]),af[6],
                        Integer.parseInt(af[9]),Integer.parseInt(af[8]),
                        Integer.parseInt(af[10]));
                    affiliatesMap.put(ap.getFacultyID(), ap);
                    break;
                  case "AssociateProfessors":
                    associatep = new AssociateProfessors(af[3],
                        Integer.parseInt(af[2]),af[1],Integer.parseInt(af[4]),
                        Integer.parseInt(af[5]),Integer.parseInt(af[7]),af[6],
                        Integer.parseInt(af[9]),Integer.parseInt(af[8]),
                        Integer.parseInt(af[10]));
                    affiliatesMap.put(ap.getFacultyID(), ap);
                    break;
                  case "FullProfessors":
                    FullProfessors fp = new FullProfessors(af[3],
                        Integer.parseInt(af[2]),af[1],Integer.parseInt(af[4]),
                        Integer.parseInt(af[5]),Integer.parseInt(af[7]),af[6],
                        Integer.parseInt(af[9]),Integer.parseInt(af[8]),
                        Integer.parseInt(af[10]));
                    affiliatesMap.put(fp.getFacultyID(), fp);
                    break;
                  case "FullTime":
                    FullTime ft = new FullTime(af[3],
                        Integer.parseInt(af[2]),af[1],Integer.parseInt(af[4]),
                        Integer.parseInt(af[5]),Integer.parseInt(af[7]),af[8],
                        af[6],Integer.parseInt(af[9]));
                    affiliatesMap.put(ft.getStaffID(), ft);
                    break;
                  case "PartTime":
                    PartTime pt = new PartTime(af[3],
                        Integer.parseInt(af[2]),af[1],Integer.parseInt(af[4]),
                        Integer.parseInt(af[5]),Integer.parseInt(af[7]),af[8],
                        af[6],Double.parseDouble(af[9]));
                    affiliatesMap.put(pt.getStaffID(), pt);
                    break;
                  case "Undergrad":
                    Undergrad ug = new Undergrad(af[3],
                        Integer.parseInt(af[2]),af[1],Integer.parseInt(af[4]),
                        Integer.parseInt(af[5]),Integer.parseInt(af[9]),af[7],
                        af[8],af[6],Integer.parseInt(af[10]),Integer.parseInt(af[11]));
                    affiliatesMap.put(ug.getStudentID(), ug);
                    break;
                  case "Graduate":
                    Graduate g = new Graduate(af[3],
                        Integer.parseInt(af[2]),af[1],Integer.parseInt(af[4]),
                        Integer.parseInt(af[5]),Integer.parseInt(af[9]),af[7],
                        af[8],af[6],Integer.parseInt(af[10]),af[11]);
                    affiliatesMap.put(g.getStudentID(), g);
                    break;
                }
              }
              br.close();
              hasError = false;
            } catch(FileNotFoundException f){
              f.printStackTrace();
              hasError = true;
            } catch(IOException io){
              io.printStackTrace();
              hasError = true;
            }
          }
          break;
        case "7": // Exit
          System.out.println();
          System.out.println("Goodbye :)");
          isExiting = true;
          break;
        default:
          System.out.println();
          System.out.println("Invalid input. Please input integers (1-7):");
      }
    }
  }
}
