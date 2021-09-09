package no.hvl.dat250.jpa.basicexample.credit;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
@Data
public class Bank {
    @Id
    public String name;
    @OneToMany
    private ArrayList<CreditCard> ownsCard;
}
