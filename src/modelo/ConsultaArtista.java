package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaArtista extends Conexion{

	public boolean registrar(Artista pro) 
	{
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		String sql = "INSER INTO artistas (codigo_artista, nombre_artista,genero_musical_artista, nacionalidad_artista, estado)VALUES (?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getCodigo_artista());
			ps.setString(2, pro.getNombre_artista());
			ps.setString(3, pro.getGenero_musica());
			ps.setString(4, pro.getNacionalidad());
			ps.setString(5, pro.getEstado());
			ps.execute();
			System.out.println("agregando artista");
			return true;
			
			
		}catch(SQLException e) 
		{
			System.out.println(e);
			return false;
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				System.out.println(e);
			}
		}
		
	}
	
	public boolean modificar(Artista pro) 
	{
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		String sql = "UPDATE artistas SET nombre_artista = ?,genero_musical_artista = ?, nacionalidad_artista = ?, estado = ?, WHERE codigo_artista";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getCodigo_artista());
			ps.setString(2, pro.getNombre_artista());
			ps.setString(3, pro.getGenero_musica());
			ps.setString(4, pro.getNacionalidad());
			ps.setString(5, pro.getEstado());
			ps.execute();
			return true;
			
			
		}catch(SQLException e) 
		{
			System.out.println(e);
			return false;
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				System.out.println(e);
			}
		}
		
	}
	
	public boolean eliminar(Artista pro) 
	{
		
		PreparedStatement ps = null;
		Connection con = getConexion();
		
		String sql = "DELETE FROM artistas WHERE codigo_artista = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getCodigo_artista());
			ps.execute();
			return true;
			
			
		}catch(SQLException e) 
		{
			System.out.println(e);
			return false;
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				System.out.println(e);
			}
		}
		
	}
	
	public boolean buscar(Artista pro) 
	{
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConexion();
		
		String sql = "SELECT * FROM artistas WHERE codigo_artista = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getCodigo_artista());
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				
				pro.setCodigo_artista(rs.getInt("codigo_artista"));
				pro.setNombre_artista(rs.getString("nombre_artista"));
				pro.setGenero_musica(rs.getString("genero_musical_artista"));
				pro.setNacionalidad(rs.getString("nacionalidad_artista"));
				pro.setEstado(rs.getString("estado"));
				System.out.println("buscando artista");
				return true;
			}
			return false;
			
		}catch(SQLException e) 
		{
			System.out.println(e);
			return false;
		} finally {
			try {
				con.close();
			}catch(SQLException e) {
				System.err.println(e);
			}
		}
		
	}
		

}

