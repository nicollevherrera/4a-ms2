package com.grupo5.output_ms.models;
import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;


public class Sale {
    @Id
    private String idsale;
    @NonNull
    private String status;
    private BigDecimal price;
    private Integer quantity;
    @NonNull
    private String nameEvent;

    public Sale (String idsale, String status, BigDecimal price, Integer quantity, String nameEvent) {
        this.idsale = idsale;
        this.status = status;
        this.price = price;
        this.quantity = quantity;
        this.nameEvent = nameEvent;
    }

    public void setStatus(@NonNull String status) {
        this.status = status;
    }
    @NonNull
    public String getStatus() {
        return status;
    }

    @NonNull
    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(@NonNull String nameEvent) {
        this.nameEvent = nameEvent;
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






