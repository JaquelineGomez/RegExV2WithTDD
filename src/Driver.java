import java.util.Calendar;
import java.util.Date;

public class Driver
{
    public static  void  main(String[] args)
    {
        Date dob_1= new Date(2003, Calendar.NOVEMBER,28);
        UserInfo user1= new UserInfo(17,dob_1, "Sally3","Rogers","324*3920","Sally101",true);
        System.out.println(user1.getAge());
        user1.setAge(18);
        System.out.println(user1.getAge());
    }
}
