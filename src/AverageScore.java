import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);

        double sum=0 ;
        double average=0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter exam scores here");
            double number = result.nextDouble();
            sum =sum+number;
        }
        System.out.println();

         System.out.println("sum equals " + sum);
         average=sum/10;

            System.out.println("Average equals " + average);


    }
}


