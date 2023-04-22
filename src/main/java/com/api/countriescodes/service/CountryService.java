package com.api.countriescodes.service;



import java.util.List;

import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Country;

@Service
public interface CountryService {

    public List<Country> getAll(); 

    public Country getCountry(Long id);

    public Country createCountry(String name, Long code_id );

    public void deleteCountry(Long id);

}
