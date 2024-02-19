package reserveplace.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reserveplace.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "reservationManagements",
    path = "reservationManagements"
)
public interface ReservationManagementRepository
    extends PagingAndSortingRepository<ReservationManagement, Long> {}
