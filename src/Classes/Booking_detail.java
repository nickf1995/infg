/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Nick
 */
public class Booking_detail {
    private int booking_detail_id;
    private Booking booking;
    private Fellow_traveler fellow_traveler;

    public int getBooking_detail_id() {
        return booking_detail_id;
    }

    public void setBooking_detail_id(int booking_detail_id) {
        this.booking_detail_id = booking_detail_id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Fellow_traveler getFellow_traveler() {
        return fellow_traveler;
    }

    public void setFellow_traveler(Fellow_traveler fellow_traveler) {
        this.fellow_traveler = fellow_traveler;
    }
}
