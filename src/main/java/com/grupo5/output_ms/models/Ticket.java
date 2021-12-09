package com.grupo5.output_ms.models;
import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;
import java.util.Date;


public class Ticket  {

    @Id
    private String idticket;
    @NonNull
    private String type;
    @NonNull
    private BigDecimal price;
    @NonNull
    private String name;
    @NonNull
    private String organizer;
    private String address;
    private Date date;
    private String hour;
    @NonNull
    private String city;
    @NonNull
    private String country;


    public Ticket(String idticket, @NonNull String type, @NonNull BigDecimal price, @NonNull String name,
                  String address, Date date, String hour, @NonNull String city, @NonNull String country, @NonNull String organizer) {

        this.idticket = idticket;
        this.type = type;
        this.price = price;
        this.name = name;
        this.address = address;
        this.date = date;
        this.hour = hour;
        this.city = city;
        this.organizer = organizer;
        this.country = country;
    }

    public String getIdticket() {
        return idticket;
    }

    public void setOrganizer(@NonNull String organizer) {
        this.organizer = organizer;
    }
    @NonNull
    public String getOrganizer() {
        return organizer;
    }

    public void setType(@NonNull String type) {
        this.type = type;
    }
    @NonNull
    public String getType() {
        return type;
    }


    public void setPrice(@NonNull BigDecimal price) {
        this.price = price;
    }
    @NonNull
    public BigDecimal getPrice() {
        return price;
    }


    public void setName(@NonNull String name) {
        this.name = name;
    }
    @NonNull
    public String getName() {
        return name;
    }


    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }


    public void setHour(String hour) {
        this.hour = hour;
    }
    public String getHour() {
        return hour;
    }


    public void setCity(@NonNull String city) {
        this.city = city;
    }
    @NonNull
    public String getCity() {
        return city;
    }


    public void setCountry(@NonNull String country) {
        this.country = country;
    }
    @NonNull
    public String getCountry() {
        return country;
    }


    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

}