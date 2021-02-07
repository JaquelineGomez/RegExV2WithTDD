import java.util.Calendar;
import java.util.Date;

public class Driver
{
    public static  void  main(String[] args)
    {
        UserInfo user1= new UserInfo(17,"Sally","Rogers","324*3920","Sally101");
        System.out.println(user1.getAge());
        user1.setAge(18);
        System.out.println(user1.getAge());
    }
}
