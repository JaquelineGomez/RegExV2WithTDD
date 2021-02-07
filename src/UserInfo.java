import java.util.Date;
import java.util.Scanner;

public class UserInfo
{
    String firstName;
    String lastName;
    String password;
    String phoneNumber;

    public UserInfo(String firstName, String lastName, String password, String phoneNumber) {
        this.firstName = validateFirstName(firstName);
        this.lastName = validateLastName(lastName);
        this.password = validatePassword(password);
        this.phoneNumber = validatePhoneNumber(phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = validateFirstName(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = validateLastName(lastName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = validatePassword(password);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = validatePhoneNumber(phoneNumber);
    }


    /*-------------------Validation---------------------------*/

    private String validateFirstName(String firstName)
    {
        while(!firstName.matches("[A-Z][a-zA-Z]*"))
        {
            System.out.println("The first name you entered is in the wrong format.");
            Scanner firstNameNew = new Scanner(System.in);
            System.out.println("Enter a new first name:");
            firstName = firstNameNew.nextLine();
        }
        return firstName;
    }

    private String validateLastName(String lastName)
    {
        while(!lastName.matches("[A-Z][a-zA-Z- ]*"))
        {
            System.out.println("The last name you entered is in the wrong format.");
            Scanner lastNameNew = new Scanner(System.in);
            System.out.println("Enter a new last name:");
            lastName = lastNameNew.nextLine();
        }
        return lastName;
    }

    private String validatePassword(String password)
    {
        while(!password.matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()–_[{}]:;',?/*~$^+=<>]+).*"))
        {
            System.out.println("The password you entered is in the wrong format.");
            Scanner passwordNew = new Scanner(System.in);
            System.out.println("Enter a new password name:");
            password = passwordNew.nextLine();
        }
        return password;
    }


    private String validatePhoneNumber(String phoneNumber)
    {
        while(!phoneNumber.matches("^\\(?([(][0-9]{3}[)])\\)?[-]?([0-9]{3})[-]?([0-9]{4})$"))
        {
            System.out.println("The phone number you entered is in the wrong format.");
            Scanner phoneNew = new Scanner(System.in);
            System.out.println("Enter a new phoneNumber name:");
            phoneNumber = phoneNew.nextLine();
        }
        return phoneNumber;
    }
}
