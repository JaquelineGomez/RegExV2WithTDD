import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.*;
class UserInfoTest {
    @Test
    void firstNameBeginsCapital() {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally");
        //assertEquals("Sally",firstNameTester.getFirstName());
        assertTrue(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameBeginsLowerCase() {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("sally");
        //assertEquals("andy",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithSpace() {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally Emily");
        //assertEquals("Sally Emily",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithHyphen() {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally-Emily");
        //assertEquals("Sally-Emily",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithNum() {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally3");
        //assertEquals("Sally3",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithPeriod() {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("Sally.");
        //assertEquals("Sally.",firstNameTester.getFirstName());
        assertFalse(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithDoubleUpperCase() {
        UserInfo firstNameTester = new UserInfo();
        firstNameTester.setFirstName("SallyG");
        //assertEquals("SallyG",firstNameTester.getFirstName());
        assertTrue(firstNameTester.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void lastNameBeginLowerCase() {
        UserInfo lastNameTester = new UserInfo();
        lastNameTester.setLastName("rogers");
        // assertEquals("rogers",lastNameTester.getLastName());
        assertFalse(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasNum() {
        UserInfo lastNameTester = new UserInfo();
        lastNameTester.setLastName("Rogers1");
        // assertEquals("Rogers1",lastNameTester.getLastName());
        assertFalse(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasSpecialCharacter() {
        UserInfo lastNameTester = new UserInfo();
        lastNameTester.setLastName("Rogers#");
        // assertEquals("Rogers#",lastNameTester.getLastName());
        assertFalse(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasSpace() {
        UserInfo lastNameTester = new UserInfo();
        lastNameTester.setLastName("Rogers Anderson");
        // assertEquals("Rogers Anderson",lastNameTester.getLastName());
        assertTrue(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasHyphen() {
        UserInfo lastNameTester = new UserInfo();
        lastNameTester.setLastName("Rogers-Gomez");
        // assertEquals("Rogers-Gomez",lastNameTester.getLastName());
        assertTrue(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasMoreOneCapital() {
        UserInfo lastNameTester = new UserInfo();
        lastNameTester.setLastName("Rogers McDaniel");
        // assertEquals("Rogers McDaniel",lastNameTester.getLastName());
        assertTrue(lastNameTester.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void passwordNoNum() {
        UserInfo passwordTest = new UserInfo();
        passwordTest.setPassword("Xy*");
        //assertEquals("Xy*",passwordTest.getPassword());
        assertFalse(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordNoLetters() {
        UserInfo passwordTest = new UserInfo();
        passwordTest.setPassword("998*");
        //assertEquals("998*",passwordTest.getPassword());
        assertFalse(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordNoSpecialCharacter() {
        UserInfo passwordTest = new UserInfo();
        passwordTest.setPassword("9A");
        //assertEquals("9A",passwordTest.getPassword());
        assertFalse(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordOtherCharacter_dash()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x-");
        //assertEquals("3x-",passwordTest.getPassword());
        assertFalse(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordOtherCharacter_quote()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x\"");
        //assertEquals("3x\"",passwordTest.getPassword());
        assertFalse(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordUpperNumAndAsterisk()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("A9*");
        //assertEquals("A9*",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordLowerNumAndAsterisk()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("a9*");
        //assertEquals("a9*",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndExclamation()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x!");
        //assertEquals("3x!",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndAtSign()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x@");
        //assertEquals("3x@",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndHastag()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x#");
        //assertEquals("3x#",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndSign()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x&");
        //assertEquals("3x&",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndParenthesis()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x()");
        //assertEquals("3x()",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndUnderscore()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x_");
        //assertEquals("3x_",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndCurlyBrackets()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x{}");
        //assertEquals("3x{}",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndColon()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x:");
        //assertEquals("3x:",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndSemiColon()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x;");
        //assertEquals("3x;",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordLowerNumAndApostrophe()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x'");
        //assertEquals("3x'",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndComma()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x,");
        //assertEquals("3x,",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndQuestionMark()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x?");
        //assertEquals("3x?",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordLowerNumAndFrontSlash()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x/");
        //assertEquals("3x/",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndBackSlash()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x\\");
        //assertEquals("3x\\",passwordTest.getPassword());
        assertFalse(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndTilde()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x~");
        //assertEquals("3x~",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndDollarSign()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x$");
        //assertEquals("3x$",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndPlusSign()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x+");
        //assertEquals("3x+",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndLessThanSign()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x<");
        //assertEquals("3x<",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndGreaterThanSign()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x>");
        //assertEquals("3x>",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndEqualThanSign()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x=");
        //assertEquals("3x=",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndCaret()
    {
        UserInfo passwordTest= new UserInfo();
        passwordTest.setPassword("3x^");
        //assertEquals("3x^",passwordTest.getPassword());
        assertTrue(passwordTest.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_[{}]:;',?/*~$^+=<>]+).*"));
    }
}
/*
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