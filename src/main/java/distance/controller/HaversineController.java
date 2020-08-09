package distance.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import distance.domain.HaversineDTO;
import distance.service.haversine.HaversineService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping
@AllArgsConstructor
public class HaversineController {

    private final HaversineService haversineService;

    @GetMapping
    public ResponseEntity<Double> getGreatCircleDistanceOnSphere(@Valid HaversineDTO haversineDTO) {
        double distance = haversineService
            .getGreatCircleDistanceOnSphere(haversineDTO.getALatitude(), haversineDTO.getALongitude(),
                haversineDTO.getBLatitude(), haversineDTO.getBLongitude(),
                haversineDTO.getRadius());
        return ResponseEntity.ok(distance);
    }

}
