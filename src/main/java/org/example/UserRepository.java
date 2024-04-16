package org.example;

public interface UserRepository {
    UserService findUserById(long id);
}

