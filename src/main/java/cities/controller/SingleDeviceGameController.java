package cities.controller;

import cities.Dto.single.CheckCityRequest;
import cities.Dto.CheckCityResponse;
import cities.Dto.CheckCityResponseWithCity;
import cities.Dto.CityDto;
import cities.entity.City;
import cities.repositories.CityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities/v1/single")
public class SingleDeviceGameController {

    private CityRepository cityRepository;

    public SingleDeviceGameController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/checkCity")
    public ResponseEntity<CheckCityResponse> checkCity(@ModelAttribute CheckCityRequest request) {
        CheckCityResponse response;
        List<City> cityFindResult = cityRepository.findByNameIgnoreCase(request.getCityName().trim());
        if (cityFindResult.isEmpty()) {
            response = new CheckCityResponse(false, request.getCityName());
        } else {
            City city = cityFindResult.get(0);
            response = new CheckCityResponseWithCity(true, new CityDto(city.getName(), city.getCountry().getName(),
                    city.getDescription(), city.getLatitude(), city.getLongitude()));
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
