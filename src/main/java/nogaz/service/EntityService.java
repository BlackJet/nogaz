package nogaz.service;

import nogaz.dao.EntityDao;

/**
 * User: user
 * Date: 06.05.14
 * Time: 15:15
 */
public class EntityService<Dao extends EntityDao> {

    Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public Object get(int id) {
        return dao.get(id);
    }

    public Object save(Object object) {
        return dao.save(object);
    }

    public void delete(Object object) {
        dao.delete(object);
    }

}
