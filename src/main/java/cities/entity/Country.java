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
    private Set<City> cites;

    public Country() {
    }

    public Country(String name, String description) {
        this.name = name;
        this.description = description;
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

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    public Set<City> getCites() {
        return cites;
    }
}
