package com.api.countriescodes.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.countriescodes.model.Code;
import com.api.countriescodes.model.Country;
import com.api.countriescodes.service.CodeService;
import com.api.countriescodes.service.CountryService;

@RestController
@CrossOrigin(origins ={"http://localhost:4200/","https://clima-appweb.netlify.app/"})
@RequestMapping("/api")
public class MainController {

    @Autowired
    CodeService codeS;

    @Autowired
    CountryService countryS;
    
    @GetMapping("/status")
    public String saludar() {
        return "Funcionando";
    }

    //Get-----------------------------------------------------------------------
     @GetMapping("/allcountry")
    public List<Country> getCountries(){
        return   countryS.getAll();
    } 

     @GetMapping("/allcode")
    public List<Code> getCodes(){
        return codeS.getAll();
    } 
    
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
    public Country createCountry(@RequestBody Country country){
        return countryS.createCountry(country);
    }
    //Delete-------------------------------------------------------------------
    @DeleteMapping("/deletecountry/{id}")
    public String deleteCountry(@PathVariable Long id){
         countryS.deleteCountry(id);
         return "eliminado";
    }
    //Modify-------------------------------------------------------------------
    @PutMapping("/modifycode/{id}")
    public Stream<Object>  updateCodeById(@RequestBody Code code, @PathVariable Long id){
        return codeS.updateCode(id,code);
    }
    @PutMapping("/modifycountry/{id}")
    public Stream<Object> updateCountryById(@RequestBody Country country, @PathVariable Long id){
         return countryS.updateCountry(id, country);
    }
}
