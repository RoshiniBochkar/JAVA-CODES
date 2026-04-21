import java.util.Scanner;
public class MarksToCgpa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float sub1Marks = scan.nextFloat();
        float sub2Marks = scan.nextFloat();
        float sub3Marks = scan.nextFloat();

        float cgpa = (sub1Marks + sub2Marks + sub3Marks)/(30);
        System.out.printf("%.2f", cgpa);

    }
}
