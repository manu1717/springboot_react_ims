package com.hndse251f.InventoryMgtSystem.services;

import com.hndse251f.InventoryMgtSystem.dtos.LoginRequest;
import com.hndse251f.InventoryMgtSystem.dtos.RegisterRequest;
import com.hndse251f.InventoryMgtSystem.dtos.Response;
import com.hndse251f.InventoryMgtSystem.dtos.UserDTO;
import com.hndse251f.InventoryMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
