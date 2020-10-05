package spring.boot.testapi;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository <Teammate, String> {

}
