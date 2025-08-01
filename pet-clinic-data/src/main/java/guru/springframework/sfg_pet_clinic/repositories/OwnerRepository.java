package guru.springframework.sfg_pet_clinic.repositories;

import guru.springframework.sfg_pet_clinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
