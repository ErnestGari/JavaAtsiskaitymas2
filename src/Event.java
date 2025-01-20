import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Event {
    protected int id;
    protected String name;
    protected String description;
    protected Date date;
    protected Time time;
    private List<Category> categories = new ArrayList<>();

    public Event(int id, String name, String description, Date date, Time time){
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public abstract String getDetails();
}
