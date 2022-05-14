package uz.pdp.bikeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.bikeservice.model.BikeEntity;

public interface BikeRepository extends JpaRepository<BikeEntity, Long> {

}
