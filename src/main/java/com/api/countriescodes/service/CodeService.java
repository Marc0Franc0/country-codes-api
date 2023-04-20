package com.api.countriescodes.service;

import org.springframework.stereotype.Service;
import com.api.countriescodes.model.Code;

@Service
public interface CodeService {

   /*  public List<Code> getAll();
 */
    public Code getCode(Long id);

    public Code createCode(String code);

    public void deleteCode(Long id);

}
