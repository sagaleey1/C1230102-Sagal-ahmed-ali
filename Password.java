import java.util.Scanner;
public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int input = scanner.nextInt();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "@#$&";
        String all = upper + lower + digits + special;

        String user_pasword = "";
        for (int i = 0; i < input; i++) {
            int random = (int) (Math.random() * all.length());
            user_pasword += all.charAt(random);
        }
        System.out.println(" you password is  " + user_pasword);

            }
        }



