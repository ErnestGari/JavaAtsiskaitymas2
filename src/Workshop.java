import java.sql.Time;
import java.util.Date;

public class Workshop extends Event{

    public Workshop(int id, String name, String description, Date date, Time time){
        super(id, name, description, date, time);
    }

    @Override
    public String getDetails() {
        return "Id: " + id + " Name: " + name + " Description: " + description + " Date: " + date + " Time: " + time;
    }
}