package com.hndse251f.InventoryMgtSystem.services;

import com.hndse251f.InventoryMgtSystem.dtos.ProductDTO;
import com.hndse251f.InventoryMgtSystem.dtos.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response getAllProducts();

    Response getProductById(Long id);

    Response deleteProduct(Long id);

    Response searchProduct(String input);
}
