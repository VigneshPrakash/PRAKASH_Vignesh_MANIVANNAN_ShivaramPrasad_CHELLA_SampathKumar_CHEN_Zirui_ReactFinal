package isep.web.project.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import isep.web.project.model.Staff;



public interface CustomerRepository extends CrudRepository<Staff, Integer>
{

  Optional<Staff> findByEmail(String email);

}
