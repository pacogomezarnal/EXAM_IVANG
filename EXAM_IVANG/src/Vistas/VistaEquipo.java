package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.CadeteController;
import Modelo.Cadete;

public class VistaEquipo extends JPanel {

	private JTextField txtFNom;
	private JTextField textFieldId;
	private JTextField textField1Apellido;
	private JTextField textField2Apellido;
	private JTextField txtFNacionalidad;
	private JComboBox cmbxEquipos;
	private Cadete cadSel;
	
	private ArrayList<String> apellidosCad;
	
	private Ventana ventana;
	private CadeteController cc;


	public VistaEquipo(Ventana v) {
		
		this.setBounds(100, 100, 521, 400);
		
		setLayout(null);
		this.ventana=v;
	
		cc = new CadeteController();
		apellidosCad = new ArrayList<String>();
		
		etiquetas();
		camposTexto();
		comboBox();
		botones();
	}
	
	private void etiquetas(){
		JLabel lblEquipo = new JLabel("Equipo");
			lblEquipo.setBounds(18, 35, 61, 16);
				add(lblEquipo);
		
		JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(208, 35, 61, 16);
				add(lblNombre);
		
		JLabel lblId = new JLabel("Id");
			lblId.setBounds(390, 35, 61, 16);
				add(lblId);
		
		JLabel lbl1Apellido = new JLabel("1er Apellido");
			lbl1Apellido.setBounds(208, 117, 101, 16);
				add(lbl1Apellido);
		
		JLabel lblNewLabel = new JLabel("2º Apellido");
			lblNewLabel.setBounds(208, 181, 101, 16);
				add(lblNewLabel);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
			lblNacionalidad.setBounds(208, 262, 101, 16);
				add(lblNacionalidad);
	}
	
	private void camposTexto(){
		txtFNom = new JTextField();
		txtFNom.setEditable(false);
		txtFNom.setBounds(208, 65, 134, 28);
			add(txtFNom);
		txtFNom.setColumns(10);
		
		textFieldId = new JTextField();
		textFieldId.setEditable(false);
		textFieldId.setBounds(390, 65, 91, 28);
			add(textFieldId);
		textFieldId.setColumns(10);
		
		textField1Apellido = new JTextField();
		textField1Apellido.setEditable(false);
		textField1Apellido.setBounds(208, 141, 134, 28);
			add(textField1Apellido);
		textField1Apellido.setColumns(10);
		
		textField2Apellido = new JTextField();
		textField2Apellido.setEditable(false);
		textField2Apellido.setBounds(208, 209, 134, 28);
			add(textField2Apellido);
		textField2Apellido.setColumns(10);
		
		txtFNacionalidad = new JTextField();
		txtFNacionalidad.setEditable(false);
		txtFNacionalidad.setBounds(208, 290, 134, 28);
			add(txtFNacionalidad);
		txtFNacionalidad.setColumns(10);
	}
	
	private void comboBox(){
		
		cmbxEquipos = new JComboBox();
			reloadComboBox();
		
		cmbxEquipos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				cadSel = (Cadete) cmbxEquipos.getSelectedItem();

				
				Volcar();
			}
		});
		
		cmbxEquipos.setBounds(18, 67, 160, 27);
			cmbxEquipos.setSelectedIndex(0);
				add(cmbxEquipos);
	}
	
	private void reloadComboBox(){
		DefaultComboBoxModel modelo = new DefaultComboBoxModel(cc.loadCadetes().toArray());
			cmbxEquipos.setModel(modelo);
				cmbxEquipos.repaint();
	}
	
	private void botones(){
		JButton button = new JButton("<< Atras");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonAtras();
			}
		});
		button.setBounds(32, 334, 146, 29);
		add(button);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BotonSiguiente();
			}
		});
		btnSiguiente.setBounds(364, 334, 117, 29);
			add(btnSiguiente);
	}
	
	private void botonAtras(){
		CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
		layout.show(ventana.getContentPane(), "PanelUsuario");
	}
	
	private void BotonSiguiente(){
		CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
		layout.show(ventana.getContentPane(), "PanelComprobacion");
	}
	
	private void Volcar(){
		txtFNom.setText(this.cadSel.getNombre());
		textFieldId.setText(String.valueOf(this.cadSel.getId()));
		dividirString(this.cadSel.getApellidos());
		txtFNacionalidad.setText(this.cadSel.getNacionalidad());
	}
	
	private void dividirString(String apellidos){
		StringTokenizer division = new StringTokenizer(apellidos);
		while(division.hasMoreTokens()){
			this.apellidosCad.add(division.nextToken());
		}
		textField1Apellido.setText(this.apellidosCad.get(0));
		textField2Apellido.setText(this.apellidosCad.get(1));
		this.apellidosCad.removeAll(apellidosCad);
	}
}
