package com.kevinvolanski.projetogenerico.repositories;

import com.kevinvolanski.projetogenerico.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface UserRepository extends JpaRepository <User, Integer> {

    @Transactional(readOnly = true)
    User findByEmail(String email);

    @Transactional(readOnly = true)
    User findByNome(String nome);

}
