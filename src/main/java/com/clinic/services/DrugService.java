package com.clinic.services;

import com.clinic.models.Drug;

import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public interface DrugService {
    public int insertRow( Drug drug);

    public List<Drug> getList();

    public int updateRow(Drug drug);

    public int deleteRow(int drugId);
}
