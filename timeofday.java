import java.util.*;
import java.text.*;
public class timeofday{
    public String inittime(){
        DateFormat dateformat = new SimpleDateFormat("hh:mm:ss a");
        Date date = new Date();
        String time = dateformat.format(date);
        return time;
        
    }
}