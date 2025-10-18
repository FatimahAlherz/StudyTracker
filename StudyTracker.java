

package com.mycompany.studytracker;

import java.util.Scanner;
public class StudyTracker {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcom to Smart Study Tracker");
       System.out.println("How many subjects do you want track? ");
      int numSubjects = input.nextInt();
       input.nextLine();
       
       
       String[] subjects = new String[numSubjects];
       int[] targetHours = new int[numSubjects];
       int[] studiesHours = new int[numSubjects];
       
       //Enter Subject & Studing Hours
       for (int i = 0; i < numSubjects; i++){
           System.out.println("\nEnter subject name # " + (i + 1) + ":");
           subjects[i]= input.nextLine();
           
           System.out.println("Enter target study hours for " + subjects[i]+ "? ");
           targetHours[i] = input.nextInt();
           input.nextLine();
            
           
       }
       
       //Enter hours of hours you have studied
       for ( int i = 0; i < numSubjects; i++){
              System.out.println("\nHow many hours did you study for " + subjects[i] + "?");
              studiesHours[i] = input.nextInt();
              
              System.out.println("\n study Progress Report: ");
       }
       for (int i = 0; i < numSubjects; i++){
                  double progress = (double) studiesHours[i] / targetHours[i] * 100;
                  System.out.printf("%s: %.1f%% of goal completed.\n", subjects[i], progress);
                  
       }
       input.close();
    }
}
