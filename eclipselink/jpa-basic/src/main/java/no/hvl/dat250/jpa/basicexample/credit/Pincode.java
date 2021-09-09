package no.hvl.dat250.jpa.basicexample.credit;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Pincode {
    @Id
    private String pincode;
    private int count;
}
