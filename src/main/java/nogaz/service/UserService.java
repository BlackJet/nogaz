package nogaz.service;

import nogaz.dao.UserDao;
import nogaz.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: user
 * Date: 06.05.14
 * Time: 15:14
 */
@Service
public class UserService extends EntityService<UserDao> {

    @Autowired
    @Override
    public void setDao(UserDao dao) {
        super.setDao(dao);
    }

    public User save(User user) {
        return (User) super.save(user);
    }

    public User get(int id) {
        return (User)super.get(id);
    }

    @Transactional
    public User create(String name, String login, String password) {
        User user = new User(login, name, password);
        return save(user);
    }


}
