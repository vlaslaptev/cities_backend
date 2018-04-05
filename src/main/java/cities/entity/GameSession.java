package cities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class GameSession {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private final long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_sessions", joinColumns = @JoinColumn(name = "session_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private final List<User> users;

    @OneToMany(mappedBy = "gameSession", cascade = CascadeType.ALL)
    private final List<GameTurn> turns;

    public GameSession(long id, List<User> users, List<GameTurn> turns) {
        this.id = id;
        this.users = users;
        this.turns = turns;
    }

    public long getId() {
        return id;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<GameTurn> getTurns() {
        return turns;
    }
}
