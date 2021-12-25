package alla.jobmanagerserver.service;

import alla.jobmanagerserver.model.User;

import java.util.Collection;

public interface UserService {
    User create(User user);
    Collection<User> list(int limit);
    User get(Integer id);
    User update(User user);
    Boolean delete(Integer id);

}
