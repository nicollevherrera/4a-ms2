package com.grupo5.output_ms.models;
import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Event {

    @Id
    private String idevent;
    private String userid;
    @NonNull
    private String  name;
    @NonNull
    private String organizer;
    @NonNull
    private Date date;
    private String hour;
    @NonNull
    private String city;
    @NonNull
    private String country;
    private String address;

    public Event(String idevent, String userid, String name,String organizer,Date date,
                 String hour, String city, String country, String address){

        this.idevent = idevent;
        this.userid = userid;
        this.name = name;
        this.organizer = organizer;
        this.date = date;
        this.hour = hour;
        this.city = city;
        this.country = country;
        this.address = address;

    }

    public String getIdevent() {
        return idevent;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
    @NonNull
    public String getName() {
        return name;
    }


    public void setOrganizer(@NonNull String organizer) {
        this.organizer = organizer;
    }
    @NonNull
    public String getOrganizer() {
        return organizer;
    }


    public void setDate(@NonNull Date date) {
        this.date = date;
    }
    @NonNull
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


    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getUserid() {
        return userid;
    }
}
