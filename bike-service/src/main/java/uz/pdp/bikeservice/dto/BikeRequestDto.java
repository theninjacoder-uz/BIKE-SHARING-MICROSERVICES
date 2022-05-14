package uz.pdp.bikeservice.dto;

import lombok.Data;

@Data
public class BikeRequestDto {

    private String bikeName;
    private long locationId;

}
