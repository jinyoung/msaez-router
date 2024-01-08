package msaez.infra;

import msaez.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class EventStormingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<EventStorming>> {

    @Override
    public EntityModel<EventStorming> process(
        EntityModel<EventStorming> model
    ) {
        return model;
    }
}
