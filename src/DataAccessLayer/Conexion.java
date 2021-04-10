package DataAccessLayer;

import BusinessModelLayer.Farmacia;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexion {

    public String URL = "jdbc:mysql://localhost:3306/db";
    public String USERNAME = "root";
    public String PASSWORD = "Chilaquilesdetete117.";

    Connection conectar = null;
    Statement st;
    ResultSet rs;

    public Connection conexion() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);

            JOptionPane.showMessageDialog(null, "Base de datos conectada correctamente.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos: " + e);

        }
        return conectar;
    }

    public ArrayList NombresFarmacias() {

        ArrayList ListaNombresFarmacias = new ArrayList();
        Farmacia farmacia = null;

        String query = "select * from farmacias";

        try {

            st = conectar.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {

                farmacia = new Farmacia();
                farmacia.setIdFarmacia(rs.getInt("idFarmacia"));
                farmacia.setNombre(rs.getString("nombre"));
                ListaNombresFarmacias.add(farmacia);

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error en el método del combo: " + e);

        }

        return ListaNombresFarmacias;

    }

}
