
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

   
        while (true) {

            System.out.println("First name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Last name:");
            String lastName = scanner.nextLine();
            System.out.println("Identification number:");
            String identificationNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(name, lastName, identificationNumber));
        }

    for (PersonalInformation personalInformation: infoCollection){
        System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
    }
    
    
    
    }
}


/*
The program described here should be implemented in the class PersonalInformationCollection. NB! Do not modify the class PersonalInformation.

After the user has entered the last set of details
(they enter an empty first name), exit the repeat statement.

Then print the collected personal information so that each entered object is printed in the following format: 
first and last names separated by a space (you don't print the identification number). 
An example of the working program is given below:

Sample output
First name: Jean
Last name: Bartik
Identification number: 271224
First name: Betty
Last name: Holberton
Identification number: 070317
First name:

Jean Bartik
Betty Holberton
*/