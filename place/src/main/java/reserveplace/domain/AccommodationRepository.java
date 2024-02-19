package reserveplace.domain;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reserveplace.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "accommodations",
    path = "accommodations"
)
public interface AccommodationRepository
    extends PagingAndSortingRepository<Accommodation, Long> {}
