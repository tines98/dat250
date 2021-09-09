package no.hvl.dat250.jpa.basicexample.credit;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int number;
    private int balance;
    private int limit;
    @OneToOne
    private Pincode pin;
    @ManyToOne
    private Bank bank;
}
