package msaez.infra;

import msaez.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class BpmnHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Bpmn>> {

    @Override
    public EntityModel<Bpmn> process(EntityModel<Bpmn> model) {
        return model;
    }
}
