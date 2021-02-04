import java.util.Date;
import java.util.Scanner;

public class UserInfo
{
    int age;
    String firstName;
    String lastName;
    String password;
    String userName;

    public UserInfo(int age, String firstName, String lastName, String password, String userName) {
        this.age = age;
        this.firstName = validateFirstName(firstName);
        this.lastName = validateLastName(lastName);
        this.password = password;
        this.userName = userName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
