package alla.jobmanagerserver.service;

import alla.jobmanagerserver.model.User;
import alla.jobmanagerserver.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;

    @Override
    public User create(User user) {
        log.info("Saving new User: {}", user);
        return userRepo.create(user);
    }

    @Override
    public Collection<User> list(int limit) {
        log.info("Fethcing all users");
        return userRepo.list(limit);
    }

    @Override
    public User get(Integer id) {
        log.info("Looking for user with id={}", id);
        return userRepo.get(id);
    }

    @Override
    public User update(User user) {
        log.info("Updating user {}", user);
        return userRepo.update(user);
    }

    @Override
    public Boolean delete(Integer id) {
        log.info("Delete user with id={}", id);
        return userRepo.delete(id);
    }
}
