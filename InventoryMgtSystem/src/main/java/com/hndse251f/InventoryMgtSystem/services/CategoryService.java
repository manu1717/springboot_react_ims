package com.hndse251f.InventoryMgtSystem.services;

import com.hndse251f.InventoryMgtSystem.dtos.CategoryDTO;
import com.hndse251f.InventoryMgtSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}