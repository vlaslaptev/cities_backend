package cities.Dto;

public class CityDto {

    private final String name;
    private final String country;
    private final String description;
    private final double latitude;
    private final double longitude;

    public CityDto(String name, String country, String description, double latitude, double longitude) {
        this.name = name;
        this.country = country;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
