package com.fantasyapp.app.ws.mobileappws.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fantasyapp.app.ws.mobileappws.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

	UserEntity findUserByEmail(String email);

	UserEntity findByUserId(String id);

}
