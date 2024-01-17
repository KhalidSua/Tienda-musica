package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexion {

	public Conexion() {
		// TODO Auto-generated constructor stub
	}
	
	private final String base = "tienda musica";
	private final String user = "root";
	private final String password = "1234";
	private final String url = "jdbc:mysql://localhost:3306/tienda_musica"+base;
	private Connection con = null;
	
	public Connection getConexion(){
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (Connection)DriverManager.getConnection(this.url,this.user,this.password);
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		catch (ClassNotFoundException ex) {
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
		}
		return con;
	}
	
	
	
	
	
	public Connection close() {
		try {
			con.close();
			System.out.println("Se cerro la conexion exitosamente");
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Error de conexion");
		}
		return con;
	}

}
