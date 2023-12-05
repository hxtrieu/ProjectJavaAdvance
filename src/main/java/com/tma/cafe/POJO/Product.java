package com.tma.cafe.POJO;

import lombok.Data;

import javax.persistence.*;

@NamedQuery(name = "Product.getAllProduct", query = "select new com.tma.cafe.wrapper.ProductWrapper(p.id,p.name,p.description,p.price,p.status,p.category.id,p.category.name) from Product p")

@NamedQuery(name = "Product.updateProductStatus", query = "update Product p set p.status =: status  where p.id =: id")

@NamedQuery(name = "Product.getProductByCategory", query = "select new com.tma.cafe.wrapper.ProductWrapper(p.id,p.name) from Product p where p.category.id =: id and p.status = 'true'")

@NamedQuery(name = "Product.getProductById", query = "select new com.tma.cafe.wrapper.ProductWrapper(p.id,p.name,p.description,p.price) from Product p where p.id =: id")
@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_fk", nullable = false)
    private Category category;

    private String description;
    private Integer price;
    private String status;

}
