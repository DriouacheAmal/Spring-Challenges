package Services;

import org.h2.engine.User;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface UserServices {
    public User getUser(Long id);
    public User addUser(User user);
    public User updateUser(User user);
    public void deleteById(Long id);
    public List<User> getAllUsers();

}
