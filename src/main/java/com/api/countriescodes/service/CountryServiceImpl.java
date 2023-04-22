package com.api.countriescodes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Code;
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
        return  (List<Country>) countryRepository.findAll();
    }
 
    @Override
    public Country getCountry(Long id) {
        // TODO Auto-generated method stub
        return countryRepository.findById(id).get();
    }

    @Override
    public Country createCountry(String name, Long code_id) {

        Code code = new Code();

        // Code assigned
        code = codeS.getCode(code_id);

        // Object for saved in database
        Country create = new Country();
        // Set properties country
        create.setName(name);
        create.setCode(code);

        return countryRepository.save(create);
    }

    @Override
    public void deleteCountry(Long id) {

        countryRepository.deleteById(id);
    }

}
