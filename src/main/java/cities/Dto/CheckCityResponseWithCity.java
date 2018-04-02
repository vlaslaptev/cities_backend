package cities.Dto;

import cities.entity.City;

public class CheckCityResponseWithCity extends CheckCityResponse {
    private final City city;

    public CheckCityResponseWithCity(boolean found, City city) {
        super(found, city.getName());
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
