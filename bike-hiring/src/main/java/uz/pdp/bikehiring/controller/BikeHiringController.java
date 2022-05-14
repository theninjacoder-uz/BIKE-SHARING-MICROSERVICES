package uz.pdp.bikehiring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.bikehiring.model.dto.BikeHiringRequestDto;
import uz.pdp.bikehiring.service.BikeHiringService;

@RestController
@RequiredArgsConstructor
public class BikeHiringController {

    private final BikeHiringService bikeHiringService;

    @PostMapping
    public boolean hireBike(@RequestBody BikeHiringRequestDto bikeHiringRequest){
        return true;
    }
}
