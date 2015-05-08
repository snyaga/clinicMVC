package com.clinic.services;

import com.clinic.dao.Drugsdao;
import com.clinic.models.Drugs;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public class DrugServiceImpl implements DrugService{
    @Autowired
    Drugsdao drugsdao;

    @Override
    public int insertRow(Drugs drugs) {
        return drugsdao.insertRow(drugs);
    }

    @Override
    public List<Drugs> getList() {
        return drugsdao.getList();
    }

    @Override
    public int updateRow(Drugs drugs) {
        return 0;
    }

    @Override
    public int deleteRow(int drugsId) {
        return 0;
    }


}
