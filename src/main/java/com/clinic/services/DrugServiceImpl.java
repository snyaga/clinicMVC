package com.clinic.services;

import com.clinic.dao.DrugDao;
import com.clinic.models.Drug;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public class DrugServiceImpl implements DrugService{
    @Autowired
    DrugDao drugDao;

    @Override
    public int insertRow(Drug drug) {
        return drugDao.insertRow(drug);
    }

    @Override
    public List<Drug> getList() {
        return drugDao.getList();
    }

    @Override
    public int updateRow(Drug drug) {
        return 0;
    }

    @Override
    public int deleteRow(int drugsId) {
        return 0;
    }


}
