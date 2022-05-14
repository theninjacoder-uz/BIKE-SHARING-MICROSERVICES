package uz.pdp.bikehiring.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("BIKE-SERVICE")
public interface BikeFeign {

    @GetMapping("/api/v1/bike")
    boolean getBike();
}
