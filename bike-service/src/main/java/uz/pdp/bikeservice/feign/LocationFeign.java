package uz.pdp.bikeservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "LOCATION-SERVICE")
public interface LocationFeign {
    @GetMapping("/api/location/get/{id}")
    Boolean getLocationById(@PathVariable("id") long id);
}
