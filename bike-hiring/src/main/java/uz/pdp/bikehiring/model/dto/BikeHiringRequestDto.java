package uz.pdp.bikehiring.model.dto;

import lombok.Data;

@Data
public class BikeHiringRequestDto {
    private String userPhoneNumber;
    private long bikeId;
    private long locationId;
}
