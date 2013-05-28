package models;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Provides CRUD functionality for accessing people.
 */
@Named
@Singleton
public interface PersonRepository extends CrudRepository<Person, Long> {
}