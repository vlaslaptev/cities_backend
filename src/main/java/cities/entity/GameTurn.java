package cities.entity;

import java.time.LocalDateTime;

public class GameTurn {
    private final long id;
    private final User user;
    private final City city;
    private final LocalDateTime turnDateTime;

    public GameTurn(long id, User user, City city, LocalDateTime turnDateTime) {
        this.id = id;
        this.user = user;
        this.city = city;
        this.turnDateTime = turnDateTime;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public City getCity() {
        return city;
    }

    public LocalDateTime getTurnDateTime() {
        return turnDateTime;
    }
}
