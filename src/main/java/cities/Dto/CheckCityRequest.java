package cities.Dto;

public class CheckCityRequest {
    private final String cityName;

    public CheckCityRequest(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
