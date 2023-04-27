package com.api.countriescodes.service;

import java.util.List;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Country;
import com.api.countriescodes.repository.CodeRepository;
import com.api.countriescodes.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    @Autowired
    CodeService codeS;

    @Autowired
    CodeRepository codeRepository;

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
    public Stream<Object> modifyCountry(Long id, Country request) {
        return countryRepository
                .findAll()
                .stream()
                .filter(country -> country.getId().equals(id))
                .map(country -> {
                    Country.builder().name(request.getName()).code(request.getCode()).build();
                    return countryRepository.save(country);
                });
    }

    @Override
    public Country createCountry(Country request) {

        if (countryRepository.existsByName(request.getName())) {
            return null;
        } else {
            return countryRepository.save(request);
        }

    }

    @Override
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
        ;
    }

}
