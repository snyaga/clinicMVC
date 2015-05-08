package com.clinic.services;

import com.clinic.models.Drugs;

import java.util.List;

/**
 * Created by susan on 5/7/15.
 */
public interface DrugService {
    public int insertRow( Drugs drugs);

    public List<Drugs> getList();

    public int updateRow(Drugs drugs);

    public int deleteRow(int drugId);
}
