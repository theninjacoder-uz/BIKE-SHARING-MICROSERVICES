package uz.pdp.bikeservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.bikeservice.dto.BikeRequestDto;
import uz.pdp.bikeservice.feign.LocationFeign;
import uz.pdp.bikeservice.model.BikeEntity;
import uz.pdp.bikeservice.repository.BikeRepository;

@Service
@RequiredArgsConstructor
public class BikeService {
    private final BikeRepository bikeRepository;
    private final LocationFeign locationFeign;

    public boolean add(BikeRequestDto bikeRequestDto){
        Boolean locationById = locationFeign.getLocationById(bikeRequestDto.getLocationId());

        if(locationById == null || !locationById)
            return false;

        bikeRepository.save(new BikeEntity(bikeRequestDto.getLocationId(), bikeRequestDto.getBikeName()));
        return true;
    }

    public BikeEntity get(long id){
        return bikeRepository.findById(id).orElse(null);
    }
}
