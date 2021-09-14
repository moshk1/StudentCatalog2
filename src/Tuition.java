import lombok.Getter;
import lombok.Setter;

// logic for seeing how much you have to pay
@Getter @Setter
public class Tuition {
    private int tuitionBalance = 0;
    private int costOfCourse = 400;


    public int getBalance() {
        return tuitionBalance;
    }

    public void setBalance(int newBalance) {
        this.tuitionBalance = newBalance;
    }

    /*public void viewBalance() {
        tuitionBalance = tuitionBalance + costOfCourse;

        System.out.println("The tuition fee is: $" + tuitionBalance);
        }*/

    /*public void payTuition() {
        viewBalance();
        System.out.print("Enter payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;

    }*/



}

