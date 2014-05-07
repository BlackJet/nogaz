package nogaz.dao;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * User: user
 * Date: 07.05.14
 * Time: 10:02
 */
@Repository
public abstract class EntityDao {

    SessionFactory sessionFactory;

    Class clazz;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        session.setFlushMode(FlushMode.COMMIT);
        return session;
    }

    public Object get(Class clazz, int id) {
        return getSession().get(clazz, id);
    }

    public Object get(int id) {
        return getSession().get(clazz, id);
    }

    public Object save(Object object) {
        Session session = getSession();
        Object result = session.merge(object);
        session.flush();
        return result;
    }

    public void delete(Object object) {
        Session session = getSession();
        session.delete(object);
        session.flush();
    }
}
