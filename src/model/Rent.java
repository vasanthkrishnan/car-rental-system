package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rent {

    private int Id;
    private User user;
    private Car car;
    private LocalDateTime dateTime;
    private int hours;
    private Double total;
    private String status;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM  hh:mm");

    public Rent() {
        dateTime = LocalDateTime.now();
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    public int getId() {
        return Id;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = LocalDateTime.parse(dateTime, formatter);
    }
    public String getDateTime() {
        return formatter.format(dateTime);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getHours() {
        return hours;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    public Double getTotal() {
        return total;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

}
