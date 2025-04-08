package project.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

import java.io.Serializable;
import java.util.Objects;


@MappedSuperclass
public class GenericModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GenericModel that = (GenericModel) o;
        return Objects.equals(ID, that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}

