package baml.pnc.sandbox.service;

import baml.pnc.sandbox.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
