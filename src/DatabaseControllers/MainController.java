package DatabaseControllers;

import Classes.Employee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

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
               String connectString = "jdbc:mysql://meru.hhs.nl:3306/14066742";
               databaseConnection = DriverManager.getConnection(connectString, "14066742", "udahshooVi");
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
        
        //Testdata aanmaken
        Employee emp1 = new Employee();
        emp1.setEmp_id(1);
        emp1.setEmp_fname("Henk");
        emp1.setEmp_lname("Baksteen");
        emp1.setUnit_id(1);
        emp1.setStreet("Bakstraat 5");
        emp1.setCity("Baktown");
        emp1.setState("BS");
        emp1.setZip_code("12345");
        emp1.setStatus("a");
        emp1.setSs_number("025487133");
        emp1.setSalary(1200000);
        Date date = new Date(250000);
        emp1.setStart_date(date);
        emp1.setTermination_date(date);
        emp1.setBirth_date(date);
        emp1.setBene_health_ins("Y");
        emp1.setBene_life_ins("Y");
        emp1.setBene_day_care("Y");
        emp1.setSex("M");
        Timestamp timestamp = new Timestamp(21332121);
        emp1.setDate_hired(timestamp);
        emp1.setFax("+33 1 68 94 56 60");
        emp1.setEmail("henk@baksteen.com");
        emp1.setWork_phone("+33 1 68 94 52 20");
        emp1.setExtension("007");
        emp1.setJob_id(1);
        emp1.setSales_branch_code(6);
        
        //employee nr 2
        Employee emp2 = new Employee();
        emp2.setEmp_id(2);
        emp2.setEmp_fname("Donald");
        emp2.setEmp_lname("Duck");
        emp2.setUnit_id(1);
        emp2.setStreet("Quack Street 1113");
        emp2.setCity("Duckstad");
        emp2.setState("DS");
        emp2.setZip_code("12345");
        emp2.setStatus("a");
        emp2.setSs_number("125675433");
        emp2.setSalary(5100000);
        emp2.setStart_date(date);
        emp2.setTermination_date(date);
        emp2.setBirth_date(date);
        emp2.setBene_health_ins("Y");
        emp2.setBene_life_ins("Y");
        emp2.setBene_day_care("Y");
        emp2.setSex("M");
        emp2.setDate_hired(timestamp);
        emp2.setFax("+33 1 68 94 56 61");
        emp2.setEmail("d.duck@ducktown.com");
        emp2.setWork_phone("+33 1 68 94 52 20");
        emp2.setExtension("001");
        emp2.setJob_id(1);
        emp2.setSales_branch_code(6);
        
        //ArrayList vullen met onze zelfgemaakte employees
        employees.add(emp1);
        employees.add(emp2);
        
        //einde testdata
        
        //Echte data vullen doormiddel van een query
        
//        try {
//            String query = "";
//            PreparedStatement statement = databaseConnection.prepareStatement(query);
//            ResultSet results = statement.executeQuery();
//            while(results.next())
//            {
//                Employee emp = new Employee();
//                //Set the employee data
//                
//                //Add employee to ArrayList
//                employees.add(emp);
//            }
//        } catch (SQLException ex) {
//            System.out.println("Kan gegevens niet ophalen " + ex);
//        }       
//        //return ArrayList
        return employees;
    }
}
