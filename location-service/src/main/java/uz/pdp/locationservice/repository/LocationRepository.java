package uz.pdp.locationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.locationservice.model.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {
}
