package guru.springframework.sfg_pet_clinic.repositories;

import guru.springframework.sfg_pet_clinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
