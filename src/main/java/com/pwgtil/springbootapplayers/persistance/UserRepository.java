package com.pwgtil.springbootapplayers.persistance;

import com.pwgtil.springbootapplayers.businesslayer.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserById(Long id);
}
