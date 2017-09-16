package baml.pnc.sandbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import baml.pnc.sandbox.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
