package quizes.q2.luka_shamatava_1.violin.sub;
import quizes.q2.luka_shamatava_1.violin.A21;
import quizes.q2.luka_shamatava_1.knife.A22;

public class R21 {
    public static void main(String[] args) {

        float rectArea = A21.hei * A21.len;
        System.out.println("The area of the rectangle is: " + rectArea);

            int actualMonthNumber = (A22.month - 1) % 12 + 1;


            String[] monthNames = {
                    "January", "February", "March", "April",
                    "May", "June", "July", "August",
                    "September", "October", "November", "December"
            };

            if (actualMonthNumber >= 1 && actualMonthNumber <= 12) {
                String monthName = monthNames[actualMonthNumber - 1];
                System.out.println("Month corresponding to " + A22.month + " is: " + monthName);
            } else {
                System.out.println("Invalid month number.");
            }
        }
    }
