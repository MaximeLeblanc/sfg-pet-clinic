package guru.springframework.sfg_pet_clinic.formatters;

import guru.springframework.sfg_pet_clinic.model.PetType;
import guru.springframework.sfg_pet_clinic.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }


    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> petTypes = petTypeService.findAll();

        for (PetType petType : petTypes) {
            if (petType.getName().equals(text)) {
                return petType;
            }
        }

        throw new ParseException("Type not found: " + text, 0);
    }
}
