package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.CadeteController;
import Modelo.Cadete;

public class VistaUsuario extends JPanel {
	
	
	private JTextField txtFNom;
	private JTextField txtFId;
	private JTextField txtFApll;
	private JTextField txtFed;
	private JTextField txtFNac;
	
	private Ventana ventana;
	private Cadete miCadete;
	private CadeteController cc;

	
	public VistaUsuario(Ventana v) {
		setLayout(null);
		this.setBounds(100, 100, 500, 400);
		this.ventana=v;
		cc = new CadeteController();

		etiquetas();	
		cTxt();
		botones();
	}
	
	private void etiquetas(){
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(203, 32, 61, 16);
		add(lblNombre);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(386, 32, 61, 16);
		add(lblId);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(203, 92, 75, 16);
		add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(203, 150, 61, 16);
		add(lblEdad);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(203, 211, 101, 16);
		add(lblNacionalidad);
		
		JLabel foto = new JLabel("");
		foto.setIcon(new ImageIcon(VistaUsuario.class.getResource("/Img/usuario.png")));
		foto.setBounds(6, 32, 183, 235);
		add(foto);
	}
	
	private void cTxt(){
		txtFNom = new JTextField();
		txtFNom.setEditable(false);
		txtFNom.setBounds(203, 52, 134, 28);
		add(txtFNom);
		txtFNom.setText(cc.loadMiCadete().getNombre());
		txtFNom.setColumns(10);
		
		txtFId = new JTextField();
		txtFId.setEditable(false);
		txtFId.setBounds(386, 52, 75, 28);
		add(txtFId);
		txtFId.setText(String.valueOf(cc.loadMiCadete().getId()));
		txtFId.setColumns(10);
		
		txtFApll = new JTextField();
		txtFApll.setEditable(false);
		txtFApll.setBounds(203, 110, 134, 28);
		add(txtFApll);
		txtFApll.setText(cc.loadMiCadete().getApellidos());
		txtFApll.setColumns(10);
		
		txtFed = new JTextField();
		txtFed.setEditable(false);
		txtFed.setBounds(203, 171, 134, 28);
		add(txtFed);
		txtFed.setText(String.valueOf(cc.loadMiCadete().getEdad()));
		txtFed.setColumns(10);
		
		txtFNac = new JTextField();
		txtFNac.setEditable(false);
		txtFNac.setBounds(203, 239, 134, 28);
		add(txtFNac);
		txtFNac.setText(cc.loadMiCadete().getNacionalidad());
		txtFNac.setColumns(10);
	}
	
	private void botones(){
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonSiguiente();
			}
		});
		
		btnSiguiente.setBounds(344, 334, 117, 29);
		add(btnSiguiente);
	}
	
	private void botonSiguiente(){
		CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
		layout.show(ventana.getContentPane(), "PanelEquipo");
	}
}
