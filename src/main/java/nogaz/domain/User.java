package nogaz.domain;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * User: Tony
 * Date: 05.05.14
 * Time: 22:48
 */
@Entity
@org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "`user`")
public class User {

    Integer id;

    String login;

    String name;

    Date createDate;

    String passHash;

    public User() {}

    public User(String login, String name, String passHash) {
        this.login = login;
        this.name = name;
        this.passHash = passHash;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    @Column(name = "passhash")
    public String getPassHash() {
        return passHash;
    }

    public void setPassHash(String passHash) {
        this.passHash = passHash;
    }
}
