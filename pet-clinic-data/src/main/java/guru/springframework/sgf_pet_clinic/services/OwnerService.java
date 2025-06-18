package guru.springframework.sgf_pet_clinic.services;

import guru.springframework.sgf_pet_clinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
