package com.api.countriescodes.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Code;

@Service
public interface CodeService {

    public List<Code> getAll();
 
    public Code getCode(Long id);

    public Code createCode(String code);

    public void deleteCode(Long id);

}
