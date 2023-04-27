package com.api.countriescodes.service;

import java.util.List;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Country;

@Service
public interface CountryService {

    public List<Country> getAll(); 

    public Country getCountry(Long id);

    public Country  createCountry(Country request );

    public void deleteCountry(Long id);

    public Stream<Object> modifyCountry(Long id, Country request);

}
