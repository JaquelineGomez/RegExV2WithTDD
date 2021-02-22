import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserInfoTest {
    @Test
    void firstNameBeginsCapital() {
        UserInfo firstNameBeginsCapital = new UserInfo();
        firstNameBeginsCapital.setFirstName("Sally");
        //assertEquals("Sally",firstNameBeginsCapital.getFirstName());
        assertTrue(firstNameBeginsCapital.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameBeginsLowerCase() {
        UserInfo firstNameBeginsLowerCase = new UserInfo();
        firstNameBeginsLowerCase.setFirstName("sally");
        //assertEquals("andy",firstNameBeginsLowerCase.getFirstName());
        assertFalse(firstNameBeginsLowerCase.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithSpace() {
        UserInfo firstNameWithSpace = new UserInfo();
        firstNameWithSpace.setFirstName("Sally Emily");
        //assertEquals("Sally Emily",firstNameWithSpace.getFirstName());
        assertFalse(firstNameWithSpace.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithHyphen() {
        UserInfo firstNameWithHyphen = new UserInfo();
        firstNameWithHyphen.setFirstName("Sally-Emily");
        //assertEquals("Sally-Emily",firstNameWithHyphen.getFirstName());
        assertFalse(firstNameWithHyphen.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithNum() {
        UserInfo firstNameWithNum = new UserInfo();
        firstNameWithNum.setFirstName("Sally3");
        //assertEquals("Sally3",firstNameWithNum.getFirstName());
        assertFalse(firstNameWithNum.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithPeriod() {
        UserInfo firstNameWithPeriod = new UserInfo();
        firstNameWithPeriod.setFirstName("Sally.");
        //assertEquals("Sally.",firstNameWithPeriod.getFirstName());
        assertFalse(firstNameWithPeriod.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void firstNameWithDoubleUpperCase() {
        UserInfo firstNameWithDoubleUpperCase = new UserInfo();
        firstNameWithDoubleUpperCase.setFirstName("SallyG");
        //assertEquals("SallyG",firstNameWithDoubleUpperCase.getFirstName());
        assertTrue(firstNameWithDoubleUpperCase.getFirstName().matches("[A-Z][a-zA-Z]*"));
    }

    @Test
    void lastNameBeginLowerCase() {
        UserInfo lastNameBeginLowerCase = new UserInfo();
        lastNameBeginLowerCase.setLastName("rogers");
        // assertEquals("rogers",lastNameBeginLowerCase.getLastName());
        assertFalse(lastNameBeginLowerCase.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasNum() {
        UserInfo lastNameHasNum = new UserInfo();
        lastNameHasNum.setLastName("Rogers1");
        // assertEquals("Rogers1",lastNameHasNum.getLastName());
        assertFalse(lastNameHasNum.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasSpecialCharacter() {
        UserInfo lastNameHasSpecialCharacter = new UserInfo();
        lastNameHasSpecialCharacter.setLastName("Rogers#");
        // assertEquals("Rogers#",lastNameHasSpecialCharacter.getLastName());
        assertFalse(lastNameHasSpecialCharacter.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasSpace() {
        UserInfo lastNameHasSpace = new UserInfo();
        lastNameHasSpace.setLastName("Rogers Anderson");
        // assertEquals("Rogers Anderson",lastNameHasSpace.getLastName());
        assertTrue(lastNameHasSpace.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasHyphen() {
        UserInfo lastNameHasHyphen = new UserInfo();
        lastNameHasHyphen.setLastName("Rogers-Gomez");
        // assertEquals("Rogers-Gomez",lastNameHasHyphen.getLastName());
        assertTrue(lastNameHasHyphen.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void lastNameHasMoreOneCapital() {
        UserInfo lastNameHasMoreOneCapital = new UserInfo();
        lastNameHasMoreOneCapital.setLastName("Rogers McDaniel");
        // assertEquals("Rogers McDaniel",lastNameHasMoreOneCapital.getLastName());
        assertTrue(lastNameHasMoreOneCapital.getLastName().matches("[A-Z][a-zA-Z- ]*"));
    }

    @Test
    void passwordNoNum() {
        UserInfo passwordNoNum = new UserInfo();
        passwordNoNum.setPassword("Xy*");
        //assertEquals("Xy*",passwordNoNum.getPassword());
        assertFalse(passwordNoNum.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordNoLetters() {
        UserInfo passwordNoLetters = new UserInfo();
        passwordNoLetters.setPassword("998*");
        //assertEquals("998*",passwordNoLetters.getPassword());
        assertFalse(passwordNoLetters.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordNoSpecialCharacter() {
        UserInfo passwordNoSpecialCharacter = new UserInfo();
        passwordNoSpecialCharacter.setPassword("9A");
        //assertEquals("9A",passwordNoSpecialCharacter.getPassword());
        assertFalse(passwordNoSpecialCharacter.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordOtherCharacter_dash()
    {
        UserInfo passwordOtherCharacter_dash= new UserInfo();
        passwordOtherCharacter_dash.setPassword("3x-");
        //assertEquals("3x-",passwordOtherCharacter_dash.getPassword());
        assertFalse(passwordOtherCharacter_dash.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordOtherCharacter_quote()
    {
        UserInfo passwordOtherCharacter_quote= new UserInfo();
        passwordOtherCharacter_quote.setPassword("3x\"");
        //assertEquals("3x\"",passwordOtherCharacter_quote.getPassword());
        assertFalse(passwordOtherCharacter_quote.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordUpperNumAndAsterisk()
    {
        UserInfo passwordUpperNumAndAsterisk= new UserInfo();
        passwordUpperNumAndAsterisk.setPassword("A9*");
        //assertEquals("A9*",passwordUpperNumAndAsterisk.getPassword());
        assertTrue(passwordUpperNumAndAsterisk.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordLowerNumAndAsterisk()
    {
        UserInfo passwordLowerNumAndAsterisk= new UserInfo();
        passwordLowerNumAndAsterisk.setPassword("a9*");
        //assertEquals("a9*",passwordLowerNumAndAsterisk.getPassword());
        assertTrue(passwordLowerNumAndAsterisk.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndExclamation()
    {
        UserInfo passwordLowerNumAndExclamation= new UserInfo();
        passwordLowerNumAndExclamation.setPassword("3x!");
        //assertEquals("3x!",passwordLowerNumAndExclamation.getPassword());
        assertTrue(passwordLowerNumAndExclamation.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndAtSign()
    {
        UserInfo passwordLowerNumAndAtSign= new UserInfo();
        passwordLowerNumAndAtSign.setPassword("3x@");
        //assertEquals("3x@",passwordLowerNumAndAtSign.getPassword());
        assertTrue(passwordLowerNumAndAtSign.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndHashtag()
    {
        UserInfo passwordLowerNumAndHashtag= new UserInfo();
        passwordLowerNumAndHashtag.setPassword("3x#");
        //assertEquals("3x#",passwordLowerNumAndHashtag.getPassword());
        assertTrue(passwordLowerNumAndHashtag.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndSign()
    {
        UserInfo passwordLowerNumAndSign= new UserInfo();
        passwordLowerNumAndSign.setPassword("3x&");
        //assertEquals("3x&",passwordLowerNumAndSign.getPassword());
        assertTrue(passwordLowerNumAndSign.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndParenthesis()
    {
        UserInfo passwordLowerNumAndParenthesis= new UserInfo();
        passwordLowerNumAndParenthesis.setPassword("3x()");
        //assertEquals("3x()",passwordLowerNumAndParenthesis.getPassword());
        assertTrue(passwordLowerNumAndParenthesis.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndUnderscore()
    {
        UserInfo passwordLowerNumAndUnderscore= new UserInfo();
        passwordLowerNumAndUnderscore.setPassword("3x_");
        //assertEquals("3x_",passwordLowerNumAndUnderscore.getPassword());
        assertTrue(passwordLowerNumAndUnderscore.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndCurlyBrackets()
    {
        UserInfo passwordLowerNumAndCurlyBrackets= new UserInfo();
        passwordLowerNumAndCurlyBrackets.setPassword("3x{}");
        //assertEquals("3x{}",passwordLowerNumAndCurlyBrackets.getPassword());
        assertTrue(passwordLowerNumAndCurlyBrackets.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndColon()
    {
        UserInfo passwordLowerNumAndColon= new UserInfo();
        passwordLowerNumAndColon.setPassword("3x:");
        //assertEquals("3x:",passwordLowerNumAndColon.getPassword());
        assertTrue(passwordLowerNumAndColon.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndSemiColon()
    {
        UserInfo passwordLowerNumAndSemiColon= new UserInfo();
        passwordLowerNumAndSemiColon.setPassword("3x;");
        //assertEquals("3x;",passwordLowerNumAndSemiColon.getPassword());
        assertTrue(passwordLowerNumAndSemiColon.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordLowerNumAndApostrophe()
    {
        UserInfo passwordLowerNumAndApostrophe= new UserInfo();
        passwordLowerNumAndApostrophe.setPassword("3x'");
        //assertEquals("3x'",passwordLowerNumAndApostrophe.getPassword());
        assertTrue(passwordLowerNumAndApostrophe.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndComma()
    {
        UserInfo passwordLowerNumAndComma= new UserInfo();
        passwordLowerNumAndComma.setPassword("3x,");
        //assertEquals("3x,",passwordLowerNumAndComma.getPassword());
        assertTrue(passwordLowerNumAndComma.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndQuestionMark()
    {
        UserInfo passwordLowerNumAndQuestionMark= new UserInfo();
        passwordLowerNumAndQuestionMark.setPassword("3x?");
        //assertEquals("3x?",passwordLowerNumAndQuestionMark.getPassword());
        assertTrue(passwordLowerNumAndQuestionMark.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }
    @Test
    void passwordLowerNumAndFrontSlash()
    {
        UserInfo passwordLowerNumAndFrontSlash= new UserInfo();
        passwordLowerNumAndFrontSlash.setPassword("3x/");
        //assertEquals("3x/",passwordLowerNumAndFrontSlash.getPassword());
        assertTrue(passwordLowerNumAndFrontSlash.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndBackSlash()
    {
        UserInfo passwordLowerNumAndBackSlash= new UserInfo();
        passwordLowerNumAndBackSlash.setPassword("3x\\");
        //assertEquals("3x\\",passwordLowerNumAndBackSlash.getPassword());
        assertFalse(passwordLowerNumAndBackSlash.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndTilde()
    {
        UserInfo passwordLowerNumAndTilde= new UserInfo();
        passwordLowerNumAndTilde.setPassword("3x~");
        //assertEquals("3x~",passwordLowerNumAndTilde.getPassword());
        assertTrue(passwordLowerNumAndTilde.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndDollarSign()
    {
        UserInfo passwordLowerNumAndDollarSign= new UserInfo();
        passwordLowerNumAndDollarSign.setPassword("3x$");
        //assertEquals("3x$",passwordLowerNumAndDollarSign.getPassword());
        assertTrue(passwordLowerNumAndDollarSign.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndPlusSign()
    {
        UserInfo passwordLowerNumAndPlusSign= new UserInfo();
        passwordLowerNumAndPlusSign.setPassword("3x+");
        //assertEquals("3x+",passwordLowerNumAndPlusSign.getPassword());
        assertTrue(passwordLowerNumAndPlusSign.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndLessThanSign()
    {
        UserInfo passwordLowerNumAndLessThanSign= new UserInfo();
        passwordLowerNumAndLessThanSign.setPassword("3x<");
        //assertEquals("3x<",passwordLowerNumAndLessThanSign.getPassword());
        assertTrue(passwordLowerNumAndLessThanSign.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndGreaterThanSign()
    {
        UserInfo passwordLowerNumAndGreaterThanSign= new UserInfo();
        passwordLowerNumAndGreaterThanSign.setPassword("3x>");
        //assertEquals("3x>",passwordLowerNumAndGreaterThanSign.getPassword());
        assertTrue(passwordLowerNumAndGreaterThanSign.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndEqualThanSign()
    {
        UserInfo passwordLowerNumAndEqualThanSign= new UserInfo();
        passwordLowerNumAndEqualThanSign.setPassword("3x=");
        //assertEquals("3x=",passwordLowerNumAndEqualThanSign.getPassword());
        assertTrue(passwordLowerNumAndEqualThanSign.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
    }

    @Test
    void passwordLowerNumAndCaret()
    {
        UserInfo passwordLowerNumAndCaret= new UserInfo();
        passwordLowerNumAndCaret.setPassword("3x^");
        //assertEquals("3x^",passwordLowerNumAndCaret.getPassword());
        assertTrue(passwordLowerNumAndCaret.getPassword().matches("(?=.*[A-Za-z]+)(?=.*[0-9]+)(?=.*[!@#&()_{}:;',?/*~$^+=<>]+).*"));
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

    @Test
    void initialToString()
    {
        UserInfo person1= new UserInfo("Sally","Rogers","134P*","(123)-456-7890",1);
        String expected = "UserInfo{firstName='Sally', lastName='Rogers', password='134P*', phoneNumber='(123)-456-7890', age='1'}";
        assertEquals(expected,person1.toString());
    }

    @Test
    void defaultConstructor()
    {
        UserInfo blankPerson = new UserInfo();
        String expected = "UserInfo{firstName='', lastName='', password='', phoneNumber='', age='0'}";
        assertEquals(expected, blankPerson.toString());
    }
}