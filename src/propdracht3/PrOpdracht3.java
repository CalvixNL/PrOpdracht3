package propdracht3;

/**
 * Author: Calvin Sammarone IG105 This program calculates the credit a student
 * has.
 */
import java.util.Scanner;

public class PrOpdracht3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                //Declare and Initialise values for subjects and subject credit values
                String programming = "Programming";
                String business = "Business";
                String infrastructure = "Infrastructure";
                String databases = "Databases";
                String userInteraction = "User Interaction";
                String projectFYS = "Project Fasten Your Seatbelts";
                String projectAD = "Project Agile Development";
                int programmingCredit = 0;
                int businessCredit = 0;
                int infrastructureCredit = 0;
                int databasesCredit = 0;
                int userInteractionCredit = 0;
                int projectFYSCredit = 0;
                int projectADCredit = 0;
                
                //User mark input area
                
                System.out.print("Please enter your: " + programming + " mark: ");
                double programmingGrade = input.nextDouble();
                System.out.print("Please enter your: " + business + " mark: ");
                double businessGrade = input.nextDouble();
                System.out.print("Please enter your: " + infrastructure + " mark: ");
                double infrastructureGrade = input.nextDouble();
                System.out.print("Please enter your: " + databases + " mark: ");
                double databasesGrade = input.nextDouble();
                System.out.print("Please enter your: " + userInteraction + " mark: ");
                double userInteractionGrade = input.nextDouble();
                System.out.print("Please enter your: " + projectFYS + " mark: ");
                double projectFYSGrade = input.nextDouble();
                System.out.print("Please enter your: " + projectAD + " mark: ");
                double projectADGrade = input.nextDouble();
                
                //The next piece of codes calculates the amount of credit 
                //a student has based on the marks they previously entered
                int totalCredit = 0;
                
                if (programmingGrade >= 5.5) {
                    programmingCredit = 3;
                totalCredit = totalCredit + programmingCredit;
                    }
                if (businessGrade >= 5.5) {
                    businessCredit = 3;
                totalCredit = totalCredit + businessCredit;
                    }
                if (infrastructureGrade >= 5.5) {
                    infrastructureCredit = 3;
                totalCredit = totalCredit + infrastructureCredit;
                    }
                if (databasesGrade >= 5.5) {
                    databasesCredit = 3;
                totalCredit = totalCredit + databasesCredit;
                    }
                if (userInteractionGrade >= 5.5) {
                    userInteractionCredit = 3;
                totalCredit = totalCredit + userInteractionCredit;
                    }
                if (projectFYSGrade >= 5.5) {
                    projectFYSCredit = 12;
                totalCredit = totalCredit + projectFYSCredit;
                    }
                if (projectADGrade >= 5.5) {
                    projectADCredit = 12;
                totalCredit = totalCredit + projectADCredit;
                    }
                if (39-totalCredit <= 33){
                    System.out.println("PAS OP! Je bent op weg naar een BAS.");
                }
                
                //Result Area
                System.out.println("Vak/Project: " + programming + "\t\t\t Cijfer: " + programmingGrade + "\t Studiepunten: " + programmingCredit);
                System.out.println("Vak/Project: " + business + "\t\t\t\t Cijfer: " + businessGrade + "\t Studiepunten: " + businessCredit);
                System.out.println("Vak/Project: " + databases + "\t\t\t\t Cijfer: " + databasesGrade + "\t Studiepunten: " + databasesCredit);
                System.out.println("Vak/Project: " + infrastructure + "\t\t\t Cijfer: " + infrastructureGrade + "\t Studiepunten: " + infrastructureCredit);
                System.out.println("Vak/Project: " + userInteraction + "\t\t\t Cijfer: " + userInteractionGrade + "\t Studiepunten: " + userInteractionCredit);
                System.out.println("Vak/Project: " + projectFYS + "\t Cijfer: " + projectFYSGrade + "\t Studiepunten: " + projectFYSCredit);
                System.out.println("Vak/Project: " + projectAD + "\t\t Cijfer: " + projectADGrade + "\t Studiepunten: " + projectADCredit);
                System.out.println("You have: " + totalCredit + " ECTS.");
    }

}
