package nogaz.dao;

import nogaz.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * User: user
 * Date: 06.05.14
 * Time: 15:16
 */
@Repository
public class UserDao extends EntityDao {

    @Autowired
    SessionFactory sessionFactory;

    public UserDao() {
        this.clazz = User.class;
    }


}
