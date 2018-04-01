package cities.entity;

public class City {
    private final String name;
    private final String description;
    private final GeoCoordinates coordinates;

    public City(String name, String description, GeoCoordinates coordinates) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public GeoCoordinates getCoordinates() {
        return coordinates;
    }
}
