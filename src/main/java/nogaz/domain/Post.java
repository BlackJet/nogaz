package nogaz.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * User: Tony
 * Date: 05.05.14
 * Time: 22:47
 */
@Entity
@Table(name = "post")
public class Post {


    Integer id;

    String content;

    Date createDate;

    User author;

    public Post() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
