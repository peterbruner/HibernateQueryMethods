package com.novauc;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private int customer_id;

    @Column
    //private Date
    private String date;

    @Column
    private int credit_card;

    @Column
    private int cvv;

    @Column
    private String category;

    @ManyToOne
    Customer customer;

    public Purchase() {
    }

    public Purchase(int customer_id, String date, int credit_card, int cvv, String category, Customer customer) {
        this.customer_id = customer_id;
        this.date = date;
        this.credit_card = credit_card;
        this.cvv = cvv;
        this.category = category;
        this.customer = customer;
    }

    public Purchase(int customer_id, String date, int credit_card, int cvv, String category) {
        this.customer_id = customer_id;
        this.date = date;
        this.credit_card = credit_card;
        this.cvv = cvv;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(int credit_card) {
        this.credit_card = credit_card;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
