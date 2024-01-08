package msaez.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msaez.EventStormingApplication;

@Entity
@Table(name = "EventStorming_table")
@Data
//<<< DDD / Aggregate Root
public class EventStorming {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String requirement;

    private String json;

    @PostPersist
    public void onPostPersist() {}

    public static EventStormingRepository repository() {
        EventStormingRepository eventStormingRepository = EventStormingApplication.applicationContext.getBean(
            EventStormingRepository.class
        );
        return eventStormingRepository;
    }
}
//>>> DDD / Aggregate Root
