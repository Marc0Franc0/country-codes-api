package com.api.countriescodes.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Code;

@Service
public interface CodeService {

    public List<Code> getAll();
 
    public Code getCode(Long id);

    public void deleteCode(Long id);

    public Stream<Object>  modifyCode(Long id, Code request);
}
