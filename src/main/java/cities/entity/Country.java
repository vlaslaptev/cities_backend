package cities.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private Set<City> cites;

    public Country(String name, String description, Set<City> cites) {
        this.name = name;
        this.description = description;
        this.cites = cites;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<City> getCites() {
        return cites;
    }
}
