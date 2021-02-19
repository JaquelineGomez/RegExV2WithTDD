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
       // assertEquals("rogers",lastNameTester.getLastName());
        assertFalse(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*") );
    }

    @Test
    void lastNameHasNum()
    {
        UserInfo lastNameTester= new UserInfo();
        lastNameTester.setLastName("Rogers1");
        // assertEquals("Rogers1",lastNameTester.getLastName());
        assertFalse(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*") );
    }

    @Test
    void lastNameHasSpecialCharacter()
    {
        UserInfo lastNameTester= new UserInfo();
        lastNameTester.setLastName("Rogers#");
        // assertEquals("Rogers#",lastNameTester.getLastName());
        assertFalse(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*") );
    }

    @Test
    void lastNameHasSpace()
    {
        UserInfo lastNameTester= new UserInfo();
        lastNameTester.setLastName("Rogers Anderson");
        // assertEquals("Rogers Anderson",lastNameTester.getLastName());
        assertTrue(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*") );
    }

    @Test
    void lastNameHasHyphen()
    {
        UserInfo lastNameTester= new UserInfo();
        lastNameTester.setLastName("Rogers-Gomez");
        // assertEquals("Rogers-Gomez",lastNameTester.getLastName());
        assertTrue(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*") );
    }

    @Test
    void lastNameHasMoreOneCapital()
    {
        UserInfo lastNameTester= new UserInfo();
        lastNameTester.setLastName("Rogers McDaniel");
        // assertEquals("Rogers McDaniel",lastNameTester.getLastName());
        assertTrue(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*") );
    }

    @Test
    void passwordNoNum()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("Xy*");
        assertEquals("Xy*",passwordTest.getPassword());
    }
}
/*
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