package com.tma.cafe.POJO;

import lombok.Data;

import javax.persistence.*;

@NamedQuery(name = "Category.getAllCategory", query="select c from Category c where c.id in (select p.category from Product p where p.status='true')")

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
