package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Conexion;

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
	public JTextPane txtId;
	public JTextPane txtCodigo;
	public JTextPane txtNombre;
	public JTextPane txtGeneroMusical;
	public JTextPane txtNacionalidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmArtista frame = new FrmArtista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Conexion db = new Conexion();

	public FrmArtista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtCodigo = new JTextPane();
		txtCodigo.setBounds(169, 37, 90, 20);
		contentPane.add(txtCodigo);
		
		JTextPane txtNombre = new JTextPane();
		txtNombre.setBounds(169, 85, 90, 20);
		contentPane.add(txtNombre);
		
		JTextPane txtGeneroMusical = new JTextPane();
		txtGeneroMusical.setBounds(169, 142, 90, 20);
		contentPane.add(txtGeneroMusical);	
		
		JTextPane txtNacionalidad = new JTextPane();
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
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(37, 257, 99, 23);
		contentPane.add(btnGuardar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(194, 257, 99, 23);
		contentPane.add(btnModificar);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBounds(344, 257, 99, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(344, 37, 99, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(37, 225, 99, 21);
		contentPane.add(lblEstado);
		
		JTextPane txtEstado = new JTextPane();
		txtEstado.setBounds(169, 225, 90, 20);
		contentPane.add(txtEstado);
		
		JTextPane txtId = new JTextPane();
		txtId.setBounds(344, 85, 90, 20);
		contentPane.add(txtId);
	}

	
}
