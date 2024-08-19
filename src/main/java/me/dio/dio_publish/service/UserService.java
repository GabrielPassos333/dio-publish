package me.dio.dio_publish.service;

import me.dio.dio_publish.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
