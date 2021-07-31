package com.myapp.myapp.service;

import com.myapp.myapp.entity.CreditCard;

public interface CreditcardService {
    public CreditCard saveData(CreditCard ccard);
    public CreditCard updateById(int id, CreditCard ccd);
}
