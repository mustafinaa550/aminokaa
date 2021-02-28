package company;
import java.sql.*;
public class Employee extends Database
{
    private ResultSet resultSet;//for query tool
    private Statement statement;//for input to postgresql

    public void InputDataBase(String id,String name,String surname,String position,String address,String salary)//function for input
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", "postgres", "amina");
            statement = connection.createStatement();
                resultSet = statement.executeQuery("insert into Employees(id,name,surname,position,address,salary)" +
                    "values(" + id + ",'" + name + "','" + surname + "'," + position + "," + address + "','" + salary + ")");//query tool
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println();
        }
    }
    public void UpdateDataBase(String id, String name, String surname, String position,String address, String salary)//function for update
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", "postgres", "amina");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("update Employee set name = " + "'" + name + "'" +
                    ", surname = " + "'" + surname + "'" +
                    ", position = " + "'" + position + "'" +
                    ", address = " + "'" + address + "'" +
                    ", salary = " + salary +
                    " where id = " + id);//query tool
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println();
        }
    }
    public void DeleteDataBase(String id)//function for delete
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", "postgres", "amina");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("delete from Employee where id = " + id);//Query tool
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println();
        }
    }


}
