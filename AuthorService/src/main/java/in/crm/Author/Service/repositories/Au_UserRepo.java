package in.crm.Author.Service.repositories;

import in.crm.Author.Service.entities.Au_User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Au_UserRepo extends JpaRepository<Au_User, Integer> {
    Optional<Au_User> findByUsername(String username);
    boolean existsByEmail(String email);
}
