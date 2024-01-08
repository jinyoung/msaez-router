package msaez.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import msaez.BpmnApplication;

@Entity
@Table(name = "Bpmn_table")
@Data
//<<< DDD / Aggregate Root
public class Bpmn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String requirement;

    private String json;

    @PostPersist
    public void onPostPersist() {}

    public static BpmnRepository repository() {
        BpmnRepository bpmnRepository = BpmnApplication.applicationContext.getBean(
            BpmnRepository.class
        );
        return bpmnRepository;
    }
}
//>>> DDD / Aggregate Root
