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
		
		String sql = "INSER INTO Artista (codigo_artista, nombre_artista,genero_musica, nacionalidad, estado)VALUES (?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, pro.getCodigo_artista());
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
		
		String sql = "UPDATE Artista SET codigo_artista = ?, nombre_artista = ?,genero_musica = ?, nacionalidad = ?, estado = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, pro.getCodigo_artista());
			ps.setString(2, pro.getNombre_artista());
			ps.setString(3, pro.getGenero_musica());
			ps.setString(4, pro.getNacionalidad());
			ps.setString(5, pro.getEstado());
			ps.setInt(6, pro.getId());
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
		
		String sql = "DELETE FROM Artista WHERE id = ?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getId());
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
		
		String sql = "SELECT * FROM Artista WHERE Codigo_artista = ?";
		System.out.println(sql);
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, pro.getCodigo_artista());
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				pro.setId(Integer.parseInt( rs.getString("id")));
				pro.setCodigo_artista(rs.getString("Codigo"));
				pro.setNombre_artista(rs.getString("Nombre Artista"));
				pro.setGenero_musica(rs.getString("Genero Musica"));
				pro.setNacionalidad(rs.getString("Nacionalidad"));
				System.out.println("busvando artista");
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
				System.out.println(e);
			}
		}
		
	}
		

}

