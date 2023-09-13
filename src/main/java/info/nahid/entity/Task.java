package info.nahid.entity;

import org.springframework.core.codec.StringDecoder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//it will be mapped to a database table and @Id
public class Task {

    @Id
    private String id;
    private String name;
    private String description;

    public Task() {

    }
    public Task(String id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
