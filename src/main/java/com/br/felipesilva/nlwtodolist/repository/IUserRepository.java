package com.br.felipesilva.nlwtodolist.repository;

import com.br.felipesilva.nlwtodolist.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {

    UserModel findByUsername(String username);
}
