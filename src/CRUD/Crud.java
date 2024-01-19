package CRUD;

import controlador.ctrlArtista;
import modelo.Artista;
import modelo.ConsultaArtista;
import vista.FrmArtista;

public class Crud {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artista mod = new Artista();
		ConsultaArtista modC = new ConsultaArtista();
		FrmArtista frm = new FrmArtista();

		ctrlArtista ctrl = new ctrlArtista(mod, modC, frm);
		ctrl.iniciar();
		frm.setVisible(true);
	}

}
