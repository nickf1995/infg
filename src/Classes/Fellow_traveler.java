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
public class Fellow_traveler {
    private int fellow_traveler_id;
    private String fname;
    private String lname;
    private String sex;
    private Date birthdate;

    public int getFellow_traveler_id() {
        return fellow_traveler_id;
    }

    public void setFellow_traveler_id(int fellow_traveler_id) {
        this.fellow_traveler_id = fellow_traveler_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
