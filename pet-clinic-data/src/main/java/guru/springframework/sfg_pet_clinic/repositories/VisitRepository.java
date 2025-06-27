package guru.springframework.sfg_pet_clinic.repositories;

import guru.springframework.sfg_pet_clinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
