package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * A person is a human.
 */
@Entity
public class Person {
    @Id
    @GeneratedValue
    public Long id;

    public String firstname;

    public String surname;
}
