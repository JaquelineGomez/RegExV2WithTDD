import java.util.Calendar;
import java.util.Date;

public class Driver
{
    public static  void  main(String[] args)
    {
        UserInfo user1= new UserInfo("Sally","Rogers","324*3920","0");

        /* Test cases (Insert everything in between '' to console when asked
        * First Name:
        * 'Sally3'           - fail
        * 'Sally A'          - should fail
        * 'Sally-Emily'      - fail
        * 'sally'            - Fail
        * 'Sally'            - pass
        *
        * Last Names:
        * 'rogers'            - fail
        * 'Rogers1'           - fail
        * 'Rogers A'          - pass
        * 'Rogers-Gomez'      - pass
        * 'Rogers McDaniel'   - pass
        *
        * 'Password'
        * 'Xy*'               - fail
        * '998*'              - fail
        * '9A'                - fail
        * '8a'                - fail
        * 'A9*'               - pass
        *
        * Phone Numbers:
        * '1234567890'        - fail
        * 'a123456789'        - fail
        * '(123)4567890'      - fail
        * '(123)456-7890'     - fail
        * '(1234)-456-7890'   - fail
        * '(123)-4567-890'    - fail
        * '(123)-456-789'     - fail
        * '(123)-456-78910'   - fail
        * '(123)-456-789a'    - fail
        * '(123)-456-7890'    - pass
        * */


    }
}
