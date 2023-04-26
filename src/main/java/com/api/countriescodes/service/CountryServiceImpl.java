package com.api.countriescodes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Country;
import com.api.countriescodes.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    @Autowired
    CodeService codeS;

    @Override
    public List<Country> getAll() {
        // TODO Auto-generated method stub
        return (List<Country>) countryRepository.findAll();
    }

    @Override
    public Country getCountry(Long id) {
        // TODO Auto-generated method stub
        return countryRepository.findById(id).get();
    }

    @Override
    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void deleteCountry(Long id) {

        countryRepository.deleteById(id);
    }

    @Override
    public String modifyCountry(Long id, Country country) {

        if (!countryRepository.findById(id).isEmpty()) {
            
            Country pais = new Country();
            pais.setId(id);
            pais.setName(country.getName());
            countryRepository.save(pais);
            return "Modificado";
        }else{
            return "Pais no existente";
        }

    }

}
