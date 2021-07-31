package com.myapp.myapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.myapp.myapp.entity.CreditCard;
import com.myapp.myapp.repository.Creditcardrepo;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class CredicardImpl implements CreditcardService{
    List<CreditCard> cc=new ArrayList<>();

    private Creditcardrepo crepo;
    @Override
    public CreditCard saveData(CreditCard ccard) {
    
        return crepo.save(ccard);
    }
    @Override
    public CreditCard updateById(int id, CreditCard ccd) {
        
        return crepo.save(ccd) ;
    }
    
}
