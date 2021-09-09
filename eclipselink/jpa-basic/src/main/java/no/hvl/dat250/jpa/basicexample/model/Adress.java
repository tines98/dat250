package no.hvl.dat250.jpa.basicexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Adress {
    @Id
    public String street;
    @Id
    public int number;
    @ManyToOne
    private Person owner;
}
