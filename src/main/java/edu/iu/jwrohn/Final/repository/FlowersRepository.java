package edu.iu.jwrohn.Final.repository;

import edu.iu.jwrohn.Final.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowersRepository
        extends CrudRepository<Flower, Integer> {
}
