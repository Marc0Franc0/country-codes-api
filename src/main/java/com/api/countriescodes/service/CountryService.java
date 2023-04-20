package com.api.countriescodes.service;


import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Country;

@Service
public interface CountryService {
/* 
    public Collection<Country> getAll(); */

    public Country getCountry(Long id);

    public Country createCountry(String name, Long code_id );

    public void deleteCountry(Long id);

}
