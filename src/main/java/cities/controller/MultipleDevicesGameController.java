package cities.controller;

import cities.repositories.CityRepository;
import cities.repositories.GameSessionRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities/v1/multiple")
public class MultipleDevicesGameController {

    private CityRepository cityRepository;
    private GameSessionRepository gameSessionRepository;

    public MultipleDevicesGameController (
            CityRepository cityRepository,
            GameSessionRepository gameSessionRepository) {
        this.cityRepository = cityRepository;
        this.gameSessionRepository = gameSessionRepository;
    }

//    @GetMapping("/checkCity")
//    public ResponseEntity<CheckCityResponse> checkCity(@ModelAttribute CheckCityMultipleDeviceRequest request) {
//
//    }

}
