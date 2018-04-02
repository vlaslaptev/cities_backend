package cities.Dto;

public class CheckCityResponse {
    private final boolean found;
    private final String cityName;

    public CheckCityResponse(boolean found, String cityName) {
        this.found = found;
        this.cityName = cityName;
    }

    public boolean isFound() {
        return found;
    }

    public String getCityName() {
        return cityName;
    }
}
