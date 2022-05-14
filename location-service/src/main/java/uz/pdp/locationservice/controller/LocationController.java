package uz.pdp.locationservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.locationservice.model.LocationEntity;
import uz.pdp.locationservice.repository.LocationRepository;

@RestController("/api/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationRepository locationRepository;

    @GetMapping("/get/{id}")
    public Boolean get(@PathVariable("id") Long id){
        locationRepository.save(new LocationEntity("Yunusobod", 1, 2));
        locationRepository.save(new LocationEntity("Mirzo Ulugbek", 1, 2));
        locationRepository.save(new LocationEntity("Yashnabod", 1, 2));
        locationRepository.save(new LocationEntity("Shaykhontokhir", 1, 2));

        return  locationRepository.findById(id).isPresent();
    }

}
