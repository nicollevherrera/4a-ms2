package com.grupo5.output_ms.models;
import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;


public class Sale {
    @Id
    private Integer idsale;
    @NonNull
    private String status;
    private BigDecimal price;
    private Integer quantity;

    public Sale (Integer idsale, String status, BigDecimal price, Integer quantity) {
        this.idsale = idsale;
        this.status = status;
        this.price = price;
        this.quantity = quantity;
    }

    public void setIdsale(Integer idsale) {
        this.idsale = idsale;
    }
    public Integer getIdsale() {
        return idsale;
    }


    public void setStatus(@NonNull String status) {
        this.status = status;
    }
    @NonNull
    public String getStatus() {
        return status;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getPrice() {
        return price;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getQuantity() {
        return quantity;
    }

}



