package ch.zhaw.gpi.ldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hauptklasse für die RestService-Template-SpringBoot-Applikation
 * 
 * @author scep
 */
@SpringBootApplication
public class LdapMockApplication {
    public static void main(String[] args){
        SpringApplication.run(LdapMockApplication.class, args);
    }
}
