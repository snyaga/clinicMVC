package com.clinic.services;

import com.clinic.dao.Drugsdao;
import com.clinic.models.Drugs;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by susan on 5/7/15.
 */
public class DrugServiceImpl implements DrugService{
    @Autowired
    Drugsdao Drugsdao;

    @Override
    public int insertRow(Drugs drugs) {
        return Drugsdao.insertRow(drugs);
    }
}
