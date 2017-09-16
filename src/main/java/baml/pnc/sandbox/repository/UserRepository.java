package baml.pnc.sandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import baml.pnc.sandbox.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
