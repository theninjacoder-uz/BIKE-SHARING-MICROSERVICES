package uz.pdp.bikeservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long locationId;
    private String name;
    private boolean isAvailable;

    public BikeEntity(long locationId, String name) {
        this.locationId = locationId;
        this.name = name;
        this.isAvailable = true;
    }
}
