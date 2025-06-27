package guru.springframework.sfg_pet_clinic.repositories;

import guru.springframework.sfg_pet_clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
