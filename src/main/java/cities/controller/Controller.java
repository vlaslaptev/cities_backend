package cities.controller;

import cities.Dto.CheckCityRequest;
import cities.Dto.CheckCityResponse;
import cities.Dto.CheckCityResponseWithCity;
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
@RequestMapping("/cities/v1")
public class Controller {

    private CityRepository cityRepository;

    public Controller(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/checkCity")
    public ResponseEntity<CheckCityResponse> checkCity(@ModelAttribute CheckCityRequest request) {
        CheckCityResponse response;
        List<City> cityFindResult = cityRepository.findByNameIgnoreCase(request.getCityName().trim());
        if (cityFindResult.isEmpty()) {
            response = new CheckCityResponse(false, request.getCityName());
        } else {
            response = new CheckCityResponseWithCity(true, cityFindResult.get(0));
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
