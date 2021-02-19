import java.util.Date;
import java.util.Scanner;

public class UserInfo
{
    String firstName;
    String lastName;
    String password;
    String phoneNumber;

    public UserInfo()
    {
        firstName="";
        lastName="";
        password="";
        phoneNumber="";
    }

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

    /*Must begin with a capital letter
    * Can be followed by lowercase or capital letters
    * Can not have spaces, numbers,or special characters
    * */
    private String validateFirstName(String firstName)
    {
        if(!firstName.matches("[A-Z][a-zA-Z]*"))
        {
            System.out.println("The first name "+ firstName+" is in the wrong format.");
        }
        return firstName;
    }

    /*Must begin with an uppercase
    * Can be followed by Capital or lowercase letters
    * Can have a space or a -
    * Can NOT have spaces, numbers,or special characters
    * */
    private String validateLastName(String lastName)
    {
        if(!lastName.matches("[A-Z][a-zA-Z- ]*")) {
            System.out.println("The last name " + lastName + " is in the wrong format.");
        }
        return lastName;
    }

    /*
    * Must Contain one letter(upper, one number, and one of the following special character: !@#&()_[{}]:;',?/*~$^+=<>
    * */
    private String validatePassword(String password)
    {
        if(!password.matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"))
        {
            System.out.println("The password "+ password+" is in the wrong format.");
        }
        return password;
    }

/*
* Must be in (xxx)-xxx-xxxx format
* Numbers no letters or special characters
* */
    private String validatePhoneNumber(String phoneNumber)
    {
        while(!phoneNumber.matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"))
        {
            System.out.println("The phone number you entered is in the wrong format.");
            Scanner phoneNew = new Scanner(System.in);
            System.out.println("Enter a new phoneNumber name:");
            phoneNumber = phoneNew.nextLine();
        }
        return phoneNumber;
    }
}
