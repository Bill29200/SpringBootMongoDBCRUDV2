package Fr.SII.SpringMongoCRUD.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Fr.SII.SpringMongoCRUD.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>{
   public Person findByFirstName(String firstname);
   public List<Person> findByAge(int age);
}
