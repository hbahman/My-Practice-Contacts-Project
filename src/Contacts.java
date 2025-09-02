import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Contacts {
    public static void main (String[] args){
        List<String> ListContact = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        String userInput,userName,userNumber;
        System.out.println("Hi There! welcome to my contacts code."+"\n-------------Menu--------------");
        System.out.println("1. Add a contact.");
        System.out.println("2. Contact list.");
        System.out.println("3. Exit." );
        System.out.println("--------------------------------");
        while (true) {
            System.out.print("Please select one of the options: ");
            userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                System.out.println("Please enter the name : ");
                userName = scanner.nextLine();
                System.out.println("Please enter the number : ");
                userNumber = scanner.nextLine();
                ListContact.add(userName + " : " + userNumber);
                System.out.println(userName + " : " + userNumber);
            }
            if (userInput.equals("2")) {
                System.out.println("---------Contact list------------");
                for (String person : ListContact) {
                    System.out.println(person);
                }
                System.out.println("---------End of list-------------");

            }
            if (userInput.equals("3")) {
                System.out.println("Exit");
                break;
            }
        }
        scanner.close();
    }
}