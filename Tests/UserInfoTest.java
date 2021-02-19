import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;
class UserInfoTest
{
    @Test
    void firstNameBeginsCapital()
    {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally");
        //assertEquals("Sally",firstNameTester.getFirstName());
        assertTrue(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }
    @Test
    void firstNameBeginsLowerCase()
    {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("sally");
        //assertEquals("andy",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithSpace()
    {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally Emily");
       //assertEquals("Sally Emily",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithHyphen()
    {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally-Emily");
        //assertEquals("Sally-Emily",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithNum()
    {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally3");
        //assertEquals("Sally3",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithPeriod()
    {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally.");
        //assertEquals("Sally.",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithDoubleUpperCase()
    {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("SallyG");
        //assertEquals("SallyG",firstNameTester.getFirstName());
        assertTrue(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void lastNameBeginLowerCase()
    {
        UserInfo lastNameTester= new UserInfo();
        lastNameTester.setLastName("rogers");
        assertEquals("rogers",lastNameTester.getLastName());
    }
}
/* Test cases
 * First Name:
 * "Sally3"           - fail
 * "Sally A"          - should fail
 * "Sally-Emily"      - fail
 * "sally"            - Fail
 * "Sally"            - pass
 *
 * Last Names:
 * "rogers"            - fail
 * "Rogers1"           - fail
 * "Rogers#"           - fail
 * "Rogers A"          - pass
 * "Rogers-Gomez"      - pass
 * "Rogers McDaniel"   - pass
 *
 * "Password"
 * "Xy*"               - fail
 * "998*"              - fail
 * "9A"                - fail
 * "8a"                - fail
 * "3x-"               - fail
 * "3x" "              - fail
 * "A9*"               - pass
 * "a1}"               - pass
 * "3x!"               - pass
 * "3x@"               - pass
 * "3x#"               - pass
 * "3x&"               - every password below should pass
 * "3x()"
 *
 * "3x_"
 * "3x{}"
 * "3x:"
 * "3x;"
 * "3x'"
 * "3x,"
 * "3x?"
 * "3x/"
 * "3x~"
 * "3x$"
 * "3x^"
 * "3x+"
 * "3x="
 * "3x<"
 * "3x>"
 *
 *
 * Phone Numbers:
 * "1234567890"        - fail
 * "a123456789"        - fail
 * "(123)4567890"      - fail
 * "(123)456-7890"     - fail
 * "(1234)-456-7890"   - fail
 * "(123)-4567-890"    - fail
 * "(123)-456-789"     - fail
 * "(123)-456-78910"   - fail
 * "(123)-456-789a"    - fail
 * "(123)-456-7890*"   - fail
 * "(123) 456 7890"    - fail
 * "123-456-7890"      - fail
 * "(123)-456-7890"    - pass
 * */