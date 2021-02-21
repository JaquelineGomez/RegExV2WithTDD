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

    @Test
    void phoneOnlyNum()
    {
        UserInfo phoneOnlyNum = new UserInfo();
        phoneOnlyNum.setPhoneNumber("1234567890");
      //  assertEquals("1234567890",phoneOnlyNum.getPhoneNumber());
        assertFalse(phoneOnlyNum.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneWithLetterNoFormat()
    {
        UserInfo phoneWithLetterNoFormat = new UserInfo();
        phoneWithLetterNoFormat.setPhoneNumber("a123456789");
        //assertEquals("a123456789",phoneWithLetterNoFormat.getPhoneNumber());
        assertFalse(phoneWithLetterNoFormat.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneNoDashesWithParenthesis()
    {
        UserInfo phoneNoDashesWithParenthesis = new UserInfo();
        phoneNoDashesWithParenthesis.setPhoneNumber("(123)4567890");
        //assertEquals("(123)4567890", phoneNoDashesWithParenthesis.getPhoneNumber());
        assertFalse(phoneNoDashesWithParenthesis.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneOneDashesWithParenthesis()
    {
        UserInfo phoneOneDashesWithParenthesis = new UserInfo();
        phoneOneDashesWithParenthesis.setPhoneNumber("(123)456-7890");
        //assertEquals("(123)456-7890", phoneOneDashesWithParenthesis.getPhoneNumber());
        assertFalse(phoneOneDashesWithParenthesis.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneMoreDigits1()
    {
        UserInfo phoneMoreDigits = new UserInfo();
        phoneMoreDigits.setPhoneNumber("(1234)-456-7890");
        //assertEquals("(1234)-456-7890", phoneMoreDigits.getPhoneNumber());
        assertFalse(phoneMoreDigits.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneMoreDigits2()
    {
        UserInfo phoneMoreDigits2 = new UserInfo();
        phoneMoreDigits2.setPhoneNumber("(123)-4567-890");
        //assertEquals("(123)-4567-890", phoneMoreDigits2.getPhoneNumber());
        assertFalse(phoneMoreDigits2.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneMoreDigits3()
    {
        UserInfo phoneMoreDigits3 = new UserInfo();
        phoneMoreDigits3.setPhoneNumber("(123)-456-78901");
        //assertEquals("(123)-456-78901", phoneMoreDigits3.getPhoneNumber());
        assertFalse(phoneMoreDigits3.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneLessDigits()
    {
        UserInfo phoneLessDigits = new UserInfo();
        phoneLessDigits.setPhoneNumber("(123)-456-789");
        //assertEquals("(123)-456-789", phoneLessDigits.getPhoneNumber());
        assertFalse(phoneLessDigits.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneSpecialCharacter()
    {
        UserInfo phoneSpecialCharacter = new UserInfo();
        phoneSpecialCharacter.setPhoneNumber("(123)-456-7890*");
        //assertEquals("(123)-456-7890*", phoneSpecialCharacter.getPhoneNumber());
        assertFalse(phoneSpecialCharacter.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneWithLetterAndFormat()
    {
        UserInfo phoneWithLetterAndFormat = new UserInfo();
        phoneWithLetterAndFormat.setPhoneNumber("(123)-456-789a");
        //assertEquals("(123)-456-789a",phoneWithLetterAndFormat.getPhoneNumber());
        assertFalse(phoneWithLetterAndFormat.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneWithSpaces()
    {
        UserInfo phoneWithSpaces = new UserInfo();
        phoneWithSpaces.setPhoneNumber("123 456 7890");
        //assertEquals("123 456 7890",phoneWithSpaces.getPhoneNumber());
        assertFalse(phoneWithSpaces.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneWithDashesNoParenthesis()
    {
        UserInfo phoneWithDashesNoParenthesis = new UserInfo();
        phoneWithDashesNoParenthesis.setPhoneNumber("123-456-7890");
        //assertEquals("123-456-7890",phoneWithDashesNoParenthesis.getPhoneNumber());
        assertFalse(phoneWithDashesNoParenthesis.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }

    @Test
    void phoneCorrectFormat()
    {
        UserInfo phoneCorrectFormat = new UserInfo();
        phoneCorrectFormat.setPhoneNumber("(123)-456-7890");
        //assertEquals("(123)-456-7890",phoneCorrectFormat.getPhoneNumber());
        assertTrue(phoneCorrectFormat.getPhoneNumber().matches("^\\(?([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$"));
    }
}