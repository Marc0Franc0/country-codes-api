package com.api.countriescodes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.api.countriescodes.model.Code;
import com.api.countriescodes.model.Country;
import com.api.countriescodes.service.CodeService;
import com.api.countriescodes.service.CountryService;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    CodeService codeS;

    @Autowired
    CountryService countryS;
    
    @GetMapping("/saludar")
    public String saludar() {
        return "Hola";
    }

   /*  @GetMapping("/allcountry")
    public ResponseEntity<?> getCountries(){
        Collection<Country> lista = countryS.getAll();
        return  ResponseEntity.status(HttpStatus.OK).body(lista);
    } */

    /* @GetMapping("/allcode")
    public List<Code> getCodes(){
        return codeS.getAll();
    } */
    //Get-----------------------------------------------------------------------
    @GetMapping("/getcountry/{id}")
    public Country getCountry(@PathVariable Long id){
        return countryS.getCountry(id);
    }

    @GetMapping("/getcode/{id}")
    public Code getCode(@PathVariable Long id){
        return codeS.getCode(id);
    }
    //Create---------------------------------------------------------------------
    @PostMapping("/newcountry")
    public Country createCountry(@RequestParam String name, @RequestParam Long id){
        return countryS.createCountry(name,id);
    }

    @PostMapping("/newcode")
    public Code createCode(@RequestParam String code){
        return codeS.createCode(code);
    }
    //Delete-------------------------------------------------------------------
    @DeleteMapping("/deletecountry/{id}")
    public String deleteCountry(@PathVariable Long id){
         countryS.deleteCountry(id);
         return "eliminado";
    }
    //No es necesario ya que al eliminar el pais este se eliminara también
    /* @DeleteMapping("/deletecode/{id}")
    public String deleteCode(@PathVariable Long id){
         codeS.deleteCode(id);
         return "eliminado";
    } */
}
