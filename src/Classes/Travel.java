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
public class Travel {
    private int travel_id;
    private int country;
    private String description;
    private String country_name;

    public int getTravel_id() {
        return travel_id;
    }

    public void setTravel_id(int travel_id) {
        this.travel_id = travel_id;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
     @Override
    public String toString()
    {
        return(getCountry_name() + " - " + getDescription());
    }

    /**
     * @return the country_name
     */
    public String getCountry_name() {
        return country_name;
    }

    /**
     * @param country_name the country_name to set
     */
    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}
