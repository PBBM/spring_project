package com.projetAl.microservice_user.dao;

import org.springframework.data.repository.CrudRepository;

import com.projetAl.microservice_user.modele.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
