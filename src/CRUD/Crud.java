package CRUD;

import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

import controlador.ctrlArtista;
import modelo.Artista;
import modelo.Conexion;
import modelo.ConsultaArtista;
import vista.FrmArtista;

public class Crud {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artista mod = new Artista();
		ConsultaArtista modC = new ConsultaArtista();
		FrmArtista frm = new FrmArtista();
		
		//Conexion cn = new Conexion();
		/*
		Statement st;
		ResultSet rs;
	
		try {
			st = (Statement) cn.getConexion().createStatement();
			rs = ((java.sql.Statement) st).executeQuery("");
			while (rs.next()) {
				System.out.println(rs.getInt("id"+ rs.getString("usuari")));
			}
			cn.getConexion().close();
		}catch (Exception e){
			
		}
		*/
		ctrlArtista ctrl = new ctrlArtista(mod, modC, frm);
		ctrl.iniciar();
		frm.setVisible(false);
	}

}
