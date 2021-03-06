package com.ujjwalkhanepani.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.ujjwalkhanepani.model.enums.OrderStatus;
import com.ujjwalkhanepani.model.enums.PaymentStatus;
import lombok.Data;

@Entity
@Table(name = "order_details")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phoneNumber", length = 10)
    private String phoneNumber;

    @Column(name = "location")
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private OrderStatus orderStatus = OrderStatus.ORDER;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus = PaymentStatus.PENDING;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order", fetch = FetchType.EAGER)
    private List<Payment> payments = new ArrayList<>();

    @Column(name = "trip_amount")
    private Integer tripAmount;

    @Column(name = "remaining_amount")
    private Integer remainingAmount;

    @Column(name = "trip_date")
    private Date tripDate;


}
