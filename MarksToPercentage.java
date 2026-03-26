import java.util.Scanner;

public class MarksToPercentage {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String Student = scan.nextLine();
        System.out.print("Enter Total Marks: ");
        double TotalMarks = scan.nextInt();

        System.out.print(Student + "'s marks in Telugu: ");
        double marks1 = scan.nextInt();
        System.out.print(Student + "'s marks in Hindi: ");
        double marks2 = scan.nextInt();
        System.out.print(Student + "'s marks in English: ");
        double marks3 = scan.nextInt();
        System.out.print(Student + "'s marks in Maths: ");
        double marks4 = scan.nextInt();
        System.out.print(Student + "'s marks in Science: ");
        double marks5 = scan.nextInt();
        System.out.print(Student + "'s marks in Social: ");
        double marks6 = scan.nextInt();

        double ScoredMarks = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        double percentage = ScoredMarks/TotalMarks * 100;
        System.out.println(Student + "'s Overall Scored Marks Out Of 600: " + ScoredMarks);
        System.out.println(Student + "'s Overall Percentage Out Of 100% is: " + percentage + "%");

    }
}
