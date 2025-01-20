import java.sql.Time;
import java.util.Date;

public class Concert extends Event{

    public Concert(int id, String name, String description, Date date, Time time){
        super(id, name, description, date, time);
    }

    @Override
    public String getDetails() {
        return "Id: " + id + " Name: " + name + " Description: " + description + " Date: " + date + " Time: " + time;
    }
}
