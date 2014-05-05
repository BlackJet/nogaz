package nogaz.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * User: Tony
 * Date: 05.05.14
 * Time: 22:48
 */
@Entity
@Table(name = "user")
public class User {

    Integer id;

    String name;

    Date createDate;

    String passHash;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
