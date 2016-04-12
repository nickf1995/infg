package DatabaseControllers;

import Classes.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        if(databaseConnection == null)
        {
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
     * Haal de employees op en zet deze in een ArrayList.
     * In de query zou ik zelf een LIMIT 10 doen o.i.d.
     * @return ArrayList
     */
public ArrayList getEmployees() {
        ArrayList employees = new ArrayList();
        
        try {
            String query = "SELECT * FROM Employee";
            PreparedStatement statement = databaseConnection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            
            while(result.next())
            {
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
            System.out.println("Kan gegevens niet ophalen " + ex);
        }
        //return ArrayList
        return employees;
    }
}
