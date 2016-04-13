package DatabaseControllers;

import Classes.Employee;
import Classes.Customer;
import Classes.Fellow_traveler;
import Classes.Travel;
import Classes.Travel_detail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashSet;

/**
 *
 * @author Nick
 */
public class MainController {

    private static Connection databaseConnection;

    /**
     * De constructor maakt de DB connectie, je moet wel de gegevens aanpassen
     *
     */
    public MainController() {
        //Create DB connection 
        if (databaseConnection == null) {
            try {
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
                String connectString = "jdbc:sqlserver://localhost:1433;;DatabaseName=OutdoorParadise;integratedSecurity=true";
                databaseConnection = DriverManager.getConnection(connectString);
            } catch (SQLException ex) {
                System.out.println("DB error " + ex);
            }
        }
    }

    /**
     * Haal de employees op en zet deze in een ArrayList. In de query zou ik
     * zelf een LIMIT 10 doen o.i.d.
     *
     * @return ArrayList
     */
    public ArrayList getEmployees() {
        ArrayList employees = new ArrayList();

        try {
            String query = "SELECT * FROM Employee";
            PreparedStatement statement = databaseConnection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Employee emp = new Employee();

                emp.setEmp_id(result.getInt("emp_id"));
                emp.setManager_id(result.getInt("manager_id"));
                emp.setEmp_fname(result.getString("emp_fname"));
                emp.setEmp_lname(result.getString("emp_lname"));
                emp.setUnit_id(result.getInt("unit_id"));
                emp.setStreet(result.getString("street"));
                emp.setCity(result.getString("city"));
                emp.setState(result.getString("state"));
                emp.setStatus(result.getString("status"));
                emp.setSs_number(result.getString("ss_number"));
                emp.setSalary(result.getFloat("salary"));
                emp.setStart_date(result.getDate("start_date"));
                emp.setTermination_date(result.getDate("termination_date"));
                emp.setBirth_date(result.getDate("birth_date"));
                emp.setBene_health_ins(result.getString("bene_health_ins"));
                emp.setBene_life_ins(result.getString("bene_life_ins"));
                emp.setBene_day_care(result.getString("bene_day_care"));
                emp.setSex(result.getString("sex"));
                emp.setDate_hired(result.getTimestamp("date_hired"));
                emp.setFax(result.getString("fax"));
                emp.setEmail(result.getString("email"));
                emp.setWork_phone(result.getString("work_phone"));
                emp.setExtension(result.getString("extension"));
                emp.setJob_id(result.getInt("job_id"));
                emp.setSales_branch_code(result.getInt("sales_branch_code"));
                emp.setZip_code(result.getString("zip_code"));
                employees.add(emp);
            }

        } catch (SQLException ex) {
            System.out.println("Kan gegevens niet ophalen van Employee" + ex);
        }
        //return ArrayList
        return employees;
    }

    public ArrayList getCustomers() {
        ArrayList customers = new ArrayList();

        try {
            String query = "SELECT * FROM Customer";
            PreparedStatement statement = databaseConnection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Customer customer = new Customer();

                customer.setCustomer_id(result.getInt("customer_id"));
                customer.setFname(result.getString("fname"));
                customer.setLname(result.getString("lname"));

                customers.add(customer);
            }

        } catch (SQLException ex) {
            System.out.println("Kan gegevens niet ophalen van Customer " + ex);
        }
        return customers;
    }

    public ArrayList getTravels() {
        ArrayList travels = new ArrayList();

        try {
            String query = "SELECT t.travel_id, t.country_id, t.description, c.country FROM Travel t JOIN Country c ON t.country_id = c.country_id";
            PreparedStatement statement = databaseConnection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Travel travel = new Travel();

                travel.setTravel_id(result.getInt("travel_id"));
                travel.setCountry(result.getInt("country_id"));
                travel.setDescription(result.getString("description"));
                travel.setCountry_name(result.getString("country"));

                travels.add(travel);
            }

        } catch (SQLException ex) {
            System.out.println("Kan gegevens niet ophalen van Travel " + ex);
        }
        return travels;
    }

    public ArrayList getTravel_detail() {
        ArrayList travel_details = new ArrayList();

        try {
            String query = "SELECT td.travel_detail_id, td.travel_id, td.start_date, td.end_date, td.price, c.country FROM Travel_detail td JOIN Travel t ON td.travel_id = t.travel_id JOIN Country c ON t.country_id = c.country_id";
            PreparedStatement statement = databaseConnection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Travel_detail td = new Travel_detail();

                td.setTravel_detail_id(result.getInt("travel_detail_id"));
//                td.setTravel(result.getString("travel_id"));
                td.setStart_date(result.getDate("start_date"));
                td.setEnd_date(result.getDate("end_date"));
                td.setPrice(result.getDouble("price"));
                td.setCountry(result.getString("country"));

                travel_details.add(td);
            }

        } catch (SQLException ex) {
            System.out.println("Kan gegevens niet ophalen van Travel_detail " + ex);
        }
        return travel_details;
    }

    public ArrayList getFellow_travelers() {
        ArrayList fellow_travelers = new ArrayList();

        try {
            String query = "SELECT * FROM Fellow_traveler";
            PreparedStatement statement = databaseConnection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Fellow_traveler ft = new Fellow_traveler();

                ft.setFellow_traveler_id(result.getInt("fellow_traveler_id"));
                ft.setFname(result.getString("fname"));
                ft.setLname(result.getString("lname"));
                ft.setSex(result.getString("sex"));
                ft.setBirthdate(result.getDate("birthdate"));

                fellow_travelers.add(ft);
            }

        } catch (SQLException ex) {
            System.out.println("Kan gegevens niet ophalen van Fellow_traveler " + ex);
        }
        return fellow_travelers;
    }

    public int createBooking(int travel_detail_id, int customer_id, HashSet<Fellow_traveler> gaat_mee) {
//        Booking id wat wordt ingevuld als de booking wordt gemaakt
        int booking_id = 0;

//        Huidige dag krijgen voor booking_date 
        Date d = new Date();
        java.sql.Date d1 = new java.sql.Date(d.getTime());

        // booking maken
        try {
            String query = "INSERT INTO Booking(travel_detail_id, customer_id, booking_date) VALUES (?, ?, ?)";

            PreparedStatement statement = databaseConnection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, travel_detail_id);
            statement.setInt(2, customer_id);
            statement.setString(3, d1.toString());
            statement.executeUpdate();
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                booking_id = generatedKeys.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Kan Booking niet aanmaken " + ex);
        }

        for (Fellow_traveler ft : gaat_mee) {
            // booking_detail maken
            try {
                String query = "INSERT INTO Booking_detail(booking_id, fellow_traveler_id) VALUES (?, ?)";

                PreparedStatement statement = databaseConnection.prepareStatement(query);
                statement.setInt(1, booking_id);
                statement.setInt(2, ft.getFellow_traveler_id());
                statement.executeUpdate(); 
            } catch (SQLException ex) {
                System.out.println("Kan Booking_detail niet aanmaken " + ex);
            }
        }
        return booking_id;

    }
    
    public boolean createFellow_traveler(String fname, String lname, String sex, String birthdate) {
        // Fellow_traveler maken
        try {
            String query = "INSERT INTO Fellow_traveler(fname, lname, sex, birthdate) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = databaseConnection.prepareStatement(query);
            statement.setString(1, fname);
            statement.setString(2, lname);
            statement.setString(3, sex);
            statement.setString(4, birthdate);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Kan Fellow_traveler niet aanmaken " + ex);
            return false;
        }
        return true;
    }

}
