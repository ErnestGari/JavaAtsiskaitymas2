import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Report {

    private List<Event> events;



    public Report(List<Event> events){
        if (events != null){
            this.events = new ArrayList<>(events);
        } else {
            this.events = new ArrayList<>();
        }
    }

    public List<Event> generateReportByDate(Date startDate, Date endDate){

        List<Event> filtered = new ArrayList<>();

        for (Event i: events){
            if(i.getDate().after(startDate) && i.getDate().before(endDate)){
                filtered.add(i);
            }
        }
        return filtered;
    }

    public Event findEventById(int eventId){

        for (Event event : events){
            if (event.getId() == eventId){

                return event;
            }
        }
        return null;
    }

    public List<Event> findEventByName(String namePart){
        List<Event> filtered = new ArrayList<>();
        for (Event i : events){
            if (i.getName().contains(namePart)){
                filtered.add(i);
            }
        }
        return filtered;
    }


}
