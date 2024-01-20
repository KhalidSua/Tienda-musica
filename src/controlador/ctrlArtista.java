package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Artista;
import modelo.ConsultaArtista;
import vista.FrmArtista;

public class ctrlArtista implements ActionListener {

	private Artista mod;
	private ConsultaArtista modC;
	private FrmArtista frm;

	public ctrlArtista(Artista mod, ConsultaArtista modC,FrmArtista frm)
	{
		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
			
		this.frm.btnLimpiar.addActionListener(this);
		this.frm.btnModificar.addActionListener(this);
		this.frm.btnBuscar.addActionListener(this);
		this.frm.btnGuardar.addActionListener(this);
		
	}
	
	
	public void iniciar() 
	{
		frm.setTitle("Producto");
		frm.setLocationRelativeTo(null);
		frm.txtCodigo.setVisible(true);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == frm.btnGuardar) {
			System.out.println("guardar");
			mod.setCodigo_artista(Integer.parseInt((frm.txtCodigo.getText())));
			mod.setNombre_artista(frm.txtNombre.getText());
			mod.setGenero_musica(frm.txtGeneroMusical.getText());
			mod.setNacionalidad(frm.txtNacionalidad.getText());
			
			if(modC.registrar(mod))
			{
				JOptionPane.showMessageDialog(null, "Registro guardado");
				limpiar();
			}else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
		}
		
		if(e.getSource() == frm.btnModificar) {
			mod.setCodigo_artista(Integer.parseInt((frm.txtCodigo.getText())));
			mod.setNombre_artista(frm.txtNombre.getText());
			mod.setGenero_musica(frm.txtGeneroMusical.getText());
			mod.setNacionalidad(frm.txtNacionalidad.getText());
			mod.setEstado(frm.txtEstado.getText());
			
			if(modC.modificar(mod))
			{
				JOptionPane.showMessageDialog(null, "Modificacion exitosa");
			}else {
				JOptionPane.showMessageDialog(null, "Error al modificar");
			}
		}
		
		if(e.getSource() == frm.btnBuscar) {
			mod.setCodigo_artista(Integer.parseInt((frm.txtCodigo.getText())));
			
			if(modC.buscar(mod))
			{
				mod.setCodigo_artista(Integer.parseInt((frm.txtCodigo.getText())));
				frm.txtCodigo.setText(String.valueOf(mod.getCodigo_artista()));
				frm.txtNombre.setText(String.valueOf(mod.getNombre_artista()));
				frm.txtNacionalidad.setText(String.valueOf(mod.getNacionalidad()));
				frm.txtGeneroMusical.setText(String.valueOf(mod.getGenero_musica()));
				
				
			}else {
				JOptionPane.showMessageDialog(null, "No se encontro registro");
				limpiar();
			}
		}
		
		if (e.getSource()== frm.btnLimpiar) {
			limpiar();
		}
	}
	
	public void limpiar() {
		frm.txtCodigo.setText(null);
		frm.txtCodigo.setText(null);
		frm.txtGeneroMusical.setText(null);
		frm.txtNombre.setText(null);
		frm.txtNacionalidad.setText(null);
	}

}
