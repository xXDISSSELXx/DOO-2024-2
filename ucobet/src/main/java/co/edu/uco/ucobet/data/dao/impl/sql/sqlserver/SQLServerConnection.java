package co.edu.uco.ucobet.data.dao.impl.sql.sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLServerConnection {
	
		private static final String url = "jdbc:postgresql://localhost:5432/ucoBet";
		private static final String usuario = "postgres";
		private static final String contraseña = "12345";
        
        
        
        String sqlCrearTabla ="CREATE TABLE IF NOT EXISTS empleados (" +
                "id SERIAL PRIMARY KEY," +
                "nombre VARCHAR(100) NOT NULL," +
                "apellido VARCHAR(100) NOT NULL," +
                "edad INTEGER," +
                "salario DECIMAL(10, 2)" +
                ");";
        {
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement()) {

               // Ejecuta la consulta
               statement.execute(sqlCrearTabla);
               System.out.println("Tabla 'empleados' creada exitosamente");

           } catch (SQLException e) {
               System.out.println("Error al crear la tabla: " + e.getMessage());
               e.printStackTrace();
           }
	}
}


