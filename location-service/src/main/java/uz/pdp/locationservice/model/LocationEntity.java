package uz.pdp.locationservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String addressName;

    private double longitude;
    private double latitude;

    public LocationEntity(String addressName, double longitude, double latitude) {
        this.addressName = addressName;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
