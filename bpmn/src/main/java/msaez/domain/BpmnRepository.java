package msaez.domain;

import msaez.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "bpmns", path = "bpmns")
public interface BpmnRepository
    extends PagingAndSortingRepository<Bpmn, Long> {}
