package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmArtista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnGuardar;
	public JButton btnModificar;
	public JButton btnLimpiar;
	public JButton btnBuscar;
	public JTextPane txtCodigo;
	public JTextPane txtNombre;
	public JTextPane txtGeneroMusical;
	public JTextPane txtNacionalidad;
	public JTextPane txtEstado;

	

	public FrmArtista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextPane();
		txtCodigo.setBounds(169, 37, 90, 20);
		contentPane.add(txtCodigo);
		
		txtNombre = new JTextPane();
		txtNombre.setBounds(169, 85, 90, 20);
		contentPane.add(txtNombre);
		
		txtGeneroMusical = new JTextPane();
		txtGeneroMusical.setBounds(169, 142, 90, 20);
		contentPane.add(txtGeneroMusical);	
		
		txtNacionalidad = new JTextPane();
		txtNacionalidad.setBounds(169, 184, 90, 20);
		contentPane.add(txtNacionalidad);
		
		JLabel lblCodArtista = new JLabel("Codigo Artista");
		lblCodArtista.setBounds(37, 38, 99, 21);
		contentPane.add(lblCodArtista);
		
		JLabel lblNombreArtista = new JLabel("Nombre Artista");
		lblNombreArtista.setBounds(37, 85, 99, 21);
		contentPane.add(lblNombreArtista);
		
		JLabel lblGeneroMusical = new JLabel("Genero Musical");
		lblGeneroMusical.setBounds(37, 141, 99, 21);
		contentPane.add(lblGeneroMusical);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(37, 184, 99, 21);
		contentPane.add(lblNacionalidad);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(37, 257, 99, 23);
		contentPane.add(btnGuardar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(194, 257, 99, 23);
		contentPane.add(btnModificar);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBounds(344, 257, 99, 23);
		contentPane.add(btnLimpiar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(344, 37, 99, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(37, 225, 99, 21);
		contentPane.add(lblEstado);
		
		txtEstado = new JTextPane();
		txtEstado.setBounds(169, 225, 90, 20);
		contentPane.add(txtEstado);
	}	
}
