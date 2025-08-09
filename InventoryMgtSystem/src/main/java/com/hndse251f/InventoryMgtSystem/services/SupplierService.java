package com.hndse251f.InventoryMgtSystem.services;

import com.hndse251f.InventoryMgtSystem.dtos.Response;
import com.hndse251f.InventoryMgtSystem.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
