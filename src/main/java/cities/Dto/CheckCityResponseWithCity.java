package cities.Dto;

public class CheckCityResponseWithCity extends CheckCityResponse {
    private final CityDto city;

    public CheckCityResponseWithCity(boolean found, CityDto city) {
        super(found, city.getName());
        this.city = city;
    }

    public CityDto getCity() {
        return city;
    }
}
