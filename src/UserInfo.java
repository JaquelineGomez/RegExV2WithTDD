import java.util.Date;

public class UserInfo
{
    int age;
    Date dob;
    String firstName;
    String lastName;
    String password;
    String userName;
    Boolean rememberUser;

    public UserInfo(int age, Date dob, String firstName, String lastName, String password, String userName, Boolean rememberUser) {
        this.age = age;
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userName = userName;
        this.rememberUser = rememberUser;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public Boolean getRememberUser() {
        return rememberUser;
    }

    public void setRememberUser(Boolean rememberUser) {
        this.rememberUser = rememberUser;
    }
}
