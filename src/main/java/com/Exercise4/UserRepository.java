package com.Exercise4;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;


public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
}



@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<Long, User> userStore = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    @Override
    public User save(User user) {
        if (user.getId() == null) {
            user.setId(idGenerator.incrementAndGet());
        }
        userStore.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userStore.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userStore.values());
    }

    @Override
    public void deleteById(Long id) {
        userStore.remove(id);
    }
}
