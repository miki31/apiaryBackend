package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_credentials")
public class User {

    @Id
    @Column(name = "crd_id")
    @GeneratedValue(generator = "increment")
    private long id;

    @Column(name = "crd_login")
    private String login;

    @Column(name = "crd_pass")
    private String pass;

    @Column(name = "crd_first_name")
    private String firstName;

    @Column(name = "crd_last_name")
    private String lastName;

    @Column(name = "crd_role")
    private String role;

    @Column(name = "crd_audit_cd")
    private Date createDate;

    @Column(name = "crd_audit_md")
    private Date modifyDate;

    @Column(name = "crd_audit_rd")
    private Date removeDate;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
    }
}
