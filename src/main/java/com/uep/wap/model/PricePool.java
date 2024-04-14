package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="PricePool")
public class PricePool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PricePool_id")
    private int PricePool_id;
    @Column(name = "totalAmount")
    private int totalAmount;
    @Column(name = "firstPrice")
    private int firstPrice;
    @Column(name = "additionalInfo")
    private String additionalInfo;

    @OneToMany
    public int getPricePool_id() {
        return PricePool_id;
    }

    public void setPricePool_id(int pricePool_id) {
        PricePool_id = pricePool_id;
    }

    public PricePool(){

    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(int firstPrice) {
        this.firstPrice = firstPrice;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
