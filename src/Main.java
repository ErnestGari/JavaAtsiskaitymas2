import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Concert concert1 = new Concert(1, "Coachella", "A fun song festival with the biggest musicians around the world!", new Date(2025-1900, 6, 24), new Time(12, 45, 30));
        Concert concert2 = new Concert(123, "Burning Man", "A fun song event int the middle of the desert where people stay with camps!", new Date(2026-1900, 11, 2), new Time(6, 0, 0));
        Concert concert3 = new Concert(521, "Woodstock", "A concert with all of the classics!", new Date(1985-1900, 3, 16), new Time(11, 30, 0));

        Workshop workshop1 = new Workshop(5, "Workshop1", "A very good workshop", new Date(2026-1900, 20, 2), new Time(8, 0, 0 ));

        Category music = new Category("Music", "All kinds of music");
        Category buisness = new Category("Buisness", "Strict buisness only");

        concert1.addCategory(music);
        concert2.addCategory(music);
        concert3.addCategory(music);

        workshop1.addCategory(buisness);

        List<Event> allEvents = new ArrayList<>();
        allEvents.add(concert1);
        allEvents.add(concert2);
        allEvents.add(concert3);
        allEvents.add(workshop1);

        System.out.println("REPORT");

        Report report = new Report(allEvents);

        System.out.println("Visi renginiai");

        for(Event i : allEvents){
            System.out.println(i.getDetails());
        }

        System.out.println();
        System.out.println("Events specific date");
        System.out.println();

        Date startDate = new Date(2023, 1, 1);
        Date endDate = new Date(2025, 12, 30);

        List<Event> eventDates = report.generateReportByDate(startDate, endDate);
        System.out.println("Renginiai vykstantis specifiniu date");
        for (Event i : eventDates){
            System.out.println(i.getDetails());
        }

        System.out.println();
        System.out.println("Pagal pavadinima");
        System.out.println();

        List<Event> eventName = report.findEventByName("Coachella");
        for (Event i : eventName){
            System.out.println(i.getDetails());
        }

        System.out.println();
        System.out.println("Pagal pavadinima");
        System.out.println();

        Event eventIds = report.findEventById(123);
        if (eventIds != null){
            System.out.println("Renginiai su id: ");
            System.out.println(eventIds.getDetails());
        }else{
            System.out.println("Nerastas toks id");
        }
    }
}