package ch.zhaw.gpi.ldap.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.gpi.ldap.entities.User;

public interface UserRepository extends JpaRepository<User, String> {


   
}
