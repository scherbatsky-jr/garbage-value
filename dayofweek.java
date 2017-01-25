
import java.util.*;

public class dayofweek{

   public String initday(){
       String day_name="0"; 
       Calendar cal = Calendar.getInstance();
        int dayno = cal.get(Calendar.DAY_OF_WEEK);
        
         if(dayno == 1)
		day_name = "SUNDAY";
	else if(dayno == 2)
		day_name = "MONDAY";
       else if(dayno == 3)
		day_name = "TUESDAY";
        else if(dayno == 4)
		day_name = "WEDNESDAY";
           else if(dayno == 5)
		day_name = "THURSDAY";
        else if(dayno == 6)
		day_name = "FRIDAY";
            else if(dayno == 7)
		day_name = "SATURDAY";
        System.out.print(dayno);
        return day_name;
    }
}