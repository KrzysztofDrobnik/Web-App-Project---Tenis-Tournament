package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PricePool")
public class PricePool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PricePool_id")
    private int PricePoolID;
    @Column(name = "totalAmount")
    private int totalAmount;
    @Column(name = "firstPrice")
    private int firstPrice;
    @Column(name = "additionalInfo")
    private String additionalInfo;

    @OneToMany(mappedBy = "pricePool_id", cascade = CascadeType.ALL)
    private List<Tournament> tournaments;

    public int getPricePoolID() {
        return PricePoolID;
    }

    public void setPricePoolID(int pricePoolID) {
        PricePoolID = pricePoolID;
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
