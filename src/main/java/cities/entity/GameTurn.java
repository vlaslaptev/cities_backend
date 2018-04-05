package cities.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class GameTurn {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "game_session_id")
    private GameSession gameSession;

    private LocalDateTime turnDateTime;

    public GameTurn(User user, City city, GameSession gameSession, LocalDateTime turnDateTime) {
        this.user = user;
        this.city = city;
        this.gameSession = gameSession;
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

    public GameSession getGameSession() {
        return gameSession;
    }

    public LocalDateTime getTurnDateTime() {
        return turnDateTime;
    }
}
