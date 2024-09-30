package web.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "email")
    private String email;

    public User(String name, String lastName, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public User() {

    }
}
