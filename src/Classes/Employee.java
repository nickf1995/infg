package Classes;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Nick
 */
public class Employee {
    
    private int emp_id;
    private int manager_id;
    private String emp_fname;
    private String emp_lname;
    private int unit_id;
    private String street;
    private String city; 
    private String state;
    private String zip_code;
    private String status;
    private String ss_number;
    private double salary;
    private java.sql.Date start_date;
    private java.sql.Date termination_date;
    private java.sql.Date birth_date;
    private String bene_health_ins;
    private String bene_life_ins; 
    private String bene_day_care;
    private String sex;
    private java.sql.Timestamp date_hired;
    private String fax;
    private String email;
    private String work_phone;
    private String extension;
    private int job_id;
    private int sales_branch_code;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getEmp_fname() {
        return emp_fname;
    }

    public void setEmp_fname(String emp_fname) {
        this.emp_fname = emp_fname;
    }

    public String getEmp_lname() {
        return emp_lname;
    }

    public void setEmp_lname(String emp_lname) {
        this.emp_lname = emp_lname;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSs_number() {
        return ss_number;
    }

    public void setSs_number(String ss_number) {
        this.ss_number = ss_number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getTermination_date() {
        return termination_date;
    }

    public void setTermination_date(Date termination_date) {
        this.termination_date = termination_date;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getBene_health_ins() {
        return bene_health_ins;
    }

    public void setBene_health_ins(String bene_health_ins) {
        this.bene_health_ins = bene_health_ins;
    }

    public String getBene_life_ins() {
        return bene_life_ins;
    }

    public void setBene_life_ins(String bene_life_ins) {
        this.bene_life_ins = bene_life_ins;
    }

    public String getBene_day_care() {
        return bene_day_care;
    }

    public void setBene_day_care(String bene_day_care) {
        this.bene_day_care = bene_day_care;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Timestamp getDate_hired() {
        return date_hired;
    }

    public void setDate_hired(Timestamp date_hired) {
        this.date_hired = date_hired;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWork_phone() {
        return work_phone;
    }

    public void setWork_phone(String work_phone) {
        this.work_phone = work_phone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getSales_branch_code() {
        return sales_branch_code;
    }

    public void setSales_branch_code(int sales_branch_code) {
        this.sales_branch_code = sales_branch_code;
    }
}
