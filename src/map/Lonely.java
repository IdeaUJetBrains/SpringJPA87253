package map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Olga Pavlova on 11/5/2015.
 */
@Entity
public class Lonely {
    @Id
    @Column
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

