package cities.Dto.multiple;

public class CheckCityMultipleDeviceRequest {
    private final String cityName;
    private final long sessionId;

    public CheckCityMultipleDeviceRequest(String cityName, long sessionId) {
        this.cityName = cityName;
        this.sessionId = sessionId;
    }

    public String getCityName() {
        return cityName;
    }

    public long getSessionId() {
        return sessionId;
    }
}
