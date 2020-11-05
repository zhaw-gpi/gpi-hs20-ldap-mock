package ch.zhaw.gpi.ldap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.gpi.ldap.entities.User;

public interface UserRepository extends JpaRepository<User, String> {
    
}
