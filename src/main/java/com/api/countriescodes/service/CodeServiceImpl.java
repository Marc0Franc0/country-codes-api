package com.api.countriescodes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Code;
import com.api.countriescodes.repository.CodeRepository;

@Service
public class CodeServiceImpl implements CodeService {
    @Autowired
    CodeRepository codeRepository;

     @Override
    public List<Code> getAll() {
        // TODO Auto-generated method stub
         return (List<Code>) codeRepository.findAll();
    }

    @Override
    public Code getCode(Long id) {
        // TODO Auto-generated method stub
        return codeRepository.findById(id).get();
    }

    @Override
    public Code createCode(String code) {
        Code create = new Code();

        create.setCode(code);
        return codeRepository.save(create);

    }

    @Override
    public void deleteCode(Long id) {

        codeRepository.deleteById(id);
    }
}
