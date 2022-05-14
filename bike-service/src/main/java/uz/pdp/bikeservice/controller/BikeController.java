package uz.pdp.bikeservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.pdp.bikeservice.dto.BikeRequestDto;
import uz.pdp.bikeservice.repository.BikeRepository;
import uz.pdp.bikeservice.service.BikeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bike")
public class BikeController {

    private final BikeService bikeService;

    @PostMapping("/add")
    public boolean add(@RequestBody BikeRequestDto bikeRequestDto){
        return bikeService.add(bikeRequestDto);
    }

}
