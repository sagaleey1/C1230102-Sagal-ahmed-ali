import java.util.Scanner;
public class Sentinal{
    public static void main(String[] args) {
        int randomNum = (int) (Math. random () * 26);
        char randomLetter = (char)('a' + randomNum);
        System. out.println("Random lowercase letter: " + randomLetter);
        int sum = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("enter nums to add In press 3 to exit ");
        System.out.println("enter number");
        int number = input.nextInt();
        while (number!=3){
            sum+=number;
            System.out. println("enter number");
            number = input.nextInt();
        }
        System.out.println("The sum:\" + sum");
        System.out.println("Enter three");


    }
        }


