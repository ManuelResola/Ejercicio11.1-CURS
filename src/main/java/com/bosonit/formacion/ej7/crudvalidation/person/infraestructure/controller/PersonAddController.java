package com.bosonit.formacion.ej7.crudvalidation.person.infraestructure.controller;

import com.bosonit.formacion.ej7.crudvalidation.person.application.PersonService;
import com.bosonit.formacion.ej7.crudvalidation.person.infraestructure.controller.input.PersonInputDto;
import com.bosonit.formacion.ej7.crudvalidation.person.infraestructure.controller.output.PersonOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")//, //ethods= {RequestMethod.GET,RequestMethod.POST})
@RestController
public class PersonAddController {

    @Autowired
    PersonService personServiceImp;
    @CrossOrigin(origins = "*")
    @PostMapping("addperson")
    public PersonOutputDto addPerson(@RequestBody PersonInputDto personInputDto) throws Exception {
        System.out.println("Hola");
            return personServiceImp.addPerson(personInputDto);
    }
}
