/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;

/**
 *
 * @author Nick
 */
public class Travel_detail {
    private int travel_detail_id;
    private Travel travel;
    private Date start_date;
    private Date end_date;
    private Double price;

    public int getTravel_detail_id() {
        return travel_detail_id;
    }

    public void setTravel_detail_id(int travel_detail_id) {
        this.travel_detail_id = travel_detail_id;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
