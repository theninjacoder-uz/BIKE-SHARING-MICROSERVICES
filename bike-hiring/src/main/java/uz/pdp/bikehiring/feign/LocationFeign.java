package uz.pdp.bikehiring.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LOCATION-SERVICE")
public interface LocationFeign {

}
