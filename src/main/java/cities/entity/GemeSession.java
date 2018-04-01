package cities.entity;

import java.util.List;

public class GemeSession {
    private final long id;
    private final List<User> users;
    private final List<GameTurn> turns;

    public GemeSession(long id, List<User> users, List<GameTurn> turns) {
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
