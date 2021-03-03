package org.geektimes.projects.user.service.impl;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.web.mvc.dbProxy.JdkRepositoryProxy;

/**
 * @author guozq
 * @date 2021-03-03-1:48 下午
 */
public class UserServiceImpl implements UserService {
    
    UserRepository userRepository = JdkRepositoryProxy.create(UserRepository.class);
    
    @Override
    public boolean register(final User user) {
        return userRepository.save(user);
    }
    
    @Override
    public boolean deregister(final User user) {
        return false;
    }
    
    @Override
    public boolean update(final User user) {
        return false;
    }
    
    @Override
    public User queryUserById(final Long id) {
        return null;
    }
    
    @Override
    public User queryUserByNameAndPassword(final String name, final String password) {
        return null;
    }
}
