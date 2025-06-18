import java.util.*;
public class Students {

        static String[] names = {"Ahmed", "Sagal", "Zahra", "Hassan", "Fadumo", "Ibrahim", "Nasteexo", "Yusuf", "Ilham", "Munira"};
        static int[] grades = {85, 90, 75, 88, 66, 90, 98, 55, 77, 98};

        public static void main(String[] args) {
            int sum = 0, max = grades[0], min = grades[0];

            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
                if (grades[i] > max) max = grades[i];
                if (grades[i] < min) min = grades[i];
            }

            double avg = sum / (double) grades.length;
            System.out.println("Average: " + avg + ", Max: " + max + ", Min: " + min);

            Scanner sc = new Scanner(System.in);
            System.out.print("Search name: ");
            String n = sc.nextLine();
            boolean found = false;

            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(n)) {
                    System.out.println(n + "'s Grade: " + grades[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        }
    }


