package com.test.alfa.alfa.repositories;

import com.test.alfa.alfa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findBySurnameContainsIgnoreCase(String surname);
}
