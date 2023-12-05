package com.tma.cafe.POJO;

import lombok.Data;

import javax.persistence.*;
@NamedQuery(name = "Bill.getAllBills",query = "select b from Bill b order by b.id desc")
@NamedQuery(name = "Bill.getBillByUserName",query = "select b from Bill b where b.createdBy =: username order by b.id desc")

@Data
@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "uuid")
    private String uuid;

    private String name;
    private String email;

    @Column(name = "contact_number")
    private String contactNumber;

    private String paymentMethod;
    private Integer total;

    @Column(name = "product_details", columnDefinition = "json")
    private String productDetail;

    private String createdBy;

}
