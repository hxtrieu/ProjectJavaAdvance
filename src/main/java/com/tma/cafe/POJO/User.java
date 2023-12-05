package com.tma.cafe.POJO;

import lombok.Data;

import javax.persistence.*;

@NamedQuery(name = "User.findByEmailId", query = "select u from User u where u.email=:email")
@NamedQuery(name = "User.getAllUser", query = "select new com.tma.cafe.wrapper.UserWrapper(u.id,u.name,u.email,u.contactNumber,u.status) from User u where u.role='user'")
@NamedQuery(name = "User.getAllAdmin", query = "select u.email from User u where u.role='admin'")
@NamedQuery(name="User.updateStatus", query = "update User u set u.status=:status where u.id=:id")

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    private String contactNumber;
    private String email;
    private String password;
    private String status;
    private String role;

}
