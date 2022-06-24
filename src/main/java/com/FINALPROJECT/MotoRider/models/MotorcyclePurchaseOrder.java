package com.FINALPROJECT.MotoRider.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MotorcyclePurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private int numOfProducts;

    private LocalDateTime datePurchase;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "motorcycle_id")
    private Motorcycle motorcycle;

    public MotorcyclePurchaseOrder() {

    }

    public MotorcyclePurchaseOrder(int numOfProducts, LocalDateTime datePurchase, Motorcycle motorcycle) {
        this.numOfProducts = numOfProducts;
        this.datePurchase = datePurchase;
        this.motorcycle = motorcycle;
    }

    public Long getId() {
        return id;
    }


    public int getNumOfProducts() {
        return numOfProducts;
    }

    public void setNumOfProducts(int numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public LocalDateTime getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(LocalDateTime datePurchase) {
        this.datePurchase = datePurchase;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }
}