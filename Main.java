import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner in = new Scanner(System.in);
        // Q1
//        System.out.println("Enter your weight :");
//        double weigh = in.nextDouble();
//        System.out.println("Enter your height :");
//        double height = in.nextDouble();
//
//        double bmi = weigh / (height*height);
//
//        System.out.println("Your bmi is : "+ bmi);


// Q2:
//        System.out.print("Enter obtained marks: ");
//        double obtainedM = in.nextDouble();
//
//        System.out.print("Enter total marks: ");
//        double totalM = in.nextDouble();
//
//        double percentage = (obtainedM / totalM) * 100;
//
//        System.out.println("Percentage: " + percentage + "%");


//        Q3:
//        System.out.print("Enter amount in USD: ");
//        double amountUSD = in.nextDouble();
//
//        System.out.print("Enter exchange rate (USD to EUR): ");
//        double exchangeR = in.nextDouble();
//
//        double amountEUR = amountUSD * exchangeR;
//
//        System.out.println("Amount in EUR: " + amountEUR);


//        Q4:
//        System.out.print("Enter a string: ");
//        String orgiString = in.nextLine();
//
//        int length = orgiString.length();
//
//        StringBuilder reversedS = new StringBuilder(orgiString).reverse();
//
//        System.out.println("Length of the string: " + length + " And Reversed string: " + reversedS);



//       Q5:
//
//       System.out.print("Enter a sentence: ");
//        String sentence = in.nextLine();
//
//        System.out.print("Enter the start index: ");
//        int startIndex = in.nextInt();
//
//        System.out.print("Enter the end index: ");
//        int endIndex = in.nextInt();
//
//        String extractedS = sentence.substring(startIndex, endIndex+1 );
//
//        System.out.println("Extracted substring: \"" + extractedS + "\"");



//      Q6:
//        System.out.print("Enter a sentence: ");
//        String sentence = in.nextLine();
//
//        System.out.print("Enter a keyword: ");
//        String keyword = in.nextLine();
//
//        boolean KeywordP = sentence.contains(keyword);
//
//        if (KeywordP) {
//            System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
//        } else {
//            System.out.println("Keyword \"" + keyword + "\" is not present in the sentence.");
//        }



//       Q7:
//       System.out.print("Enter a sentence: ");
//        String sentence = in.nextLine();
//
//        System.out.print("Enter the word to replace: ");
//        String word1 = in.next();
//
//        System.out.print("Enter the replacement word: ");
//        String word2 = in.next();
//
//        String modifie = sentence.replaceAll(word1, word2);
//
//        System.out.println( modifie);


//       Q8:
//
//       System.out.print("Enter the first string: ");
//        String string1 = in.nextLine();
//
//        System.out.print("Enter the second string: ");
//        String string2 = in.nextLine();
//
//        boolean equal = string1.equalsIgnoreCase(string2);
//
//        if (equal) {
//            System.out.println("Strings are equal (ignoring case).");
//        } else {
//            System.out.println("Strings are not equal (ignoring case).");
//        }



//      Q9:
//      System.out.print("Enter your role: ");
//        String role = in.nextLine();
//
//        if (role.equalsIgnoreCase("admin")) {
//            System.out.println("Welcome admin");
//        } else if (role.equalsIgnoreCase("superuser")) {
//            System.out.println("Welcome superuser");
//        } else if (role.equalsIgnoreCase("user")) {
//            System.out.println("Welcome user");
//        }


//     Q10:
//     System.out.print("Input the 1st number: ");
//        int num1 = in.nextInt();
//
//        System.out.print("Input the 2nd number: ");
//        int num2 = in.nextInt();
//
//        System.out.print("Input the 3rd number: ");
//        int num3 = in.nextInt();
//
//        int greatest = num1;
//
//        if (num2 > greatest) {
//            greatest = num2;
//        }
//        if (num3 > greatest) {
//            greatest = num3;
//        }
//
//        System.out.println("The greatest: " + greatest);

//
//      Q:11
//
//      Random random = new Random();
//        int ranD = random.nextInt(7) + 1;
//        String weekdayName;
//        switch (ranD) {
//            case 1:
//                weekdayName = "Sunday";
//                break;
//            case 2:
//                weekdayName = "Monday";
//                break;
//            case 3:
//                weekdayName = "Tuesday";
//                break;
//            case 4:
//                weekdayName = "Wednesday";
//                break;
//            case 5:
//                weekdayName = "Thursday";
//                break;
//            case 6:
//                weekdayName = "Friday";
//                break;
//            case 7:
//                weekdayName = "Saturday";
//                break;
//            default:
//                weekdayName = "Invalid day";
//                break;
//        }
//
//        System.out.println(weekdayName);



//
//       Q12:
//
//       System.out.print("Enter your numeric score: ");
//        int numericScore = in.nextInt();
//
//        char letterGrade;
//
//        if (numericScore >= 90 && numericScore <= 100) {
//            letterGrade = 'A';
//        } else if (numericScore >= 80 && numericScore <= 89) {
//            letterGrade = 'B';
//        } else if (numericScore >= 70 && numericScore <= 79) {
//            letterGrade = 'C';
//        } else if (numericScore >= 60 && numericScore <= 69) {
//            letterGrade = 'D';
//        } else {
//            letterGrade = 'F';
//        }
//
//        System.out.println("Numeric Score: " + numericScore);
//        System.out.println("Letter Grade: " + letterGrade);



        //Q13:
//        System.out.print("Enter your age: ");
//        int age = in.nextInt();
//
//        String category;
//
//        if (age < 13) {
//            category = "Child";
//        } else if (age >= 13 && age <= 19) {
//            category = "Teenager";
//        } else {
//            category = "Adult";
//        }
//
//        System.out.println("You are a " + category + ".");


    }
}