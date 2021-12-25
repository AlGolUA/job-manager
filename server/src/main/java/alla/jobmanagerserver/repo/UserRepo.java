package alla.jobmanagerserver.repo;

import alla.jobmanagerserver.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepo {
    private final List<User> users = new ArrayList<>();
    private int genUserId = 4;
    {
        users.add(new User(1, "A", "Big A"));
        users.add(new User(2, "B", "Big B"));
        users.add(new User(3, "c", "Small c"));
    }

    public User create(User user) {
        user.setId(genUserId++);
        users.add(user);
        return user;
    }

    public Collection<User> list(int limit) {
        return users;
    }

    public User get(Integer id) {
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                return user;
            }
        }
        return null;
    }

    public User update(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(users.get(i).getId(), user.getId())) {
                users.set(i, user);
                return user;
            }
        }
        return null;
    }

    public Boolean delete(Integer id) {
        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(users.get(i).getId(), id)) {
                users.remove(i);
                return true;
            }
        }
        return false;
    }
}
