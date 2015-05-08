package com.clinic.dao;

import com.clinic.models.Drug;

import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public interface DrugDao {
    public int insertRow( Drug drug);

    public List<Drug> getList();

    public int updateRow(Drug drug);

    public int deleteRow(int drugsId);
}
