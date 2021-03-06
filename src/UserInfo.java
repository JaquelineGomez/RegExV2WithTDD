import java.util.Date;
import java.util.Scanner;

public class UserInfo
{
    String firstName;
    String lastName;
    String password;
    String phoneNumber;
    int age;
    String language;

    public UserInfo()
    {
        firstName="";
        lastName="";
        password="";
        phoneNumber="";
        age=0;
        language="English";
    }

    public UserInfo(String firstName, String lastName, String password, String phoneNumber, int age, String language) {
        this.firstName = validateFirstName(firstName);
        this.lastName = validateLastName(lastName);
        this.password = validatePassword(password);
        this.phoneNumber = validatePhoneNumber(phoneNumber);
        this.age=validateAge(age);
        this.language= language;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = validateAge(age);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
    * Must Contain one letter(upper/lowercase, one number, and one of the following special character: !@#&()_[{}]:;',?/*~$^+=<>
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
        if(!phoneNumber.matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"))
        {
            System.out.println("The phone number "+phoneNumber+" is in the wrong format.");
        }
        return phoneNumber;
    }


    private int validateAge(int age)
    {
        if(age<0)
        {
            System.out.println("You can't have a negative age (╬≖_≖)");
            age = 0;
        }
        if(age>117)
        {
            System.out.println("You can't be older than the oldest person alive (╯°□°）╯");
            age = 117;
        }
        return age;
    }


  /*Brain Method*/
    public String canUse()
    {
        String output = "";
        if(age<13)
        {
            output = "I'm sorry, you are to young to use the app.（◞‸◟ ）";
        }
        else if(age>=18)
        {
            output = "Thank you for using our app (✿╹◡╹)";
        }
        else if(age>=13)
        {
            output = "You need your parents permission to use our app.";
        }
        return output;
    }

    public String welcomeMessage()
    {
        String output="";
        if(language.equalsIgnoreCase("English"))
        {
            output="Thank you for using our program ٩( ^ᴗ^ )۶";
        }
        else if(language.equalsIgnoreCase("French"))
        {
            output="Merci d'utiliser notre programme ٩( ^ᴗ^ )۶";
        }
        else if(language.equalsIgnoreCase("Spanish"))
        {
            output="Gracias por utilizar nuestro programa ٩( ^ᴗ^ )۶";
        }
        else if(language.equalsIgnoreCase("Chinese"))
        {
            output="謝謝您使用我們的程序 ٩( ^ᴗ^ )۶";
        }
        else
        {
            output= "I'm sorry we currently don't support other languages (╥﹏╥ )";
        }

        return output;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age='" + age +'\''+
                ", language='" + language +
                "'}";
    }
}
