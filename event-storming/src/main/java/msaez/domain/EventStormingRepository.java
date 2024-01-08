package msaez.domain;

import msaez.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "eventStormings",
    path = "eventStormings"
)
public interface EventStormingRepository
    extends PagingAndSortingRepository<EventStorming, Long> {}
