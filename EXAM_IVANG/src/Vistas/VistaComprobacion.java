package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Modelo.IngresoLaby;

public class VistaComprobacion extends JPanel {
	private JTextField txtFID;
	private JTextField tct1App;
	private JTextField txtMD;
	
	private Ventana ventana;
	private IngresoLaby ingreso;
	private String valreturn;

	public VistaComprobacion(Ventana v) {
		this.setBounds(100, 100, 500, 400);
			setLayout(null);
				this.ventana=v;
					ingreso = new IngresoLaby();
		etq();
		camposTexto();
		btns();
	}
	
	private void etq(){
		JLabel lblId = new JLabel("Id");
			lblId.setBounds(33, 49, 61, 16);
				add(lblId);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
			lblerApellido.setBounds(194, 49, 120, 16);
				add(lblerApellido);
	}
	
	private void camposTexto(){
		txtFID = new JTextField();
			txtFID.setBounds(33, 77, 134, 28);
				add(txtFID);
					txtFID.setColumns(10);
		
		tct1App = new JTextField();
			tct1App.setBounds(194, 77, 134, 28);
				add(tct1App);
					tct1App.setColumns(10);
		
		txtMD = new JTextField();
			txtMD.setHorizontalAlignment(SwingConstants.CENTER);
				txtMD.setText("Mensaje devuelto");
					txtMD.setBounds(33, 194, 425, 28);
						add(txtMD);
							txtMD.setColumns(10);
	}
	
	private void btns(){
		JButton btnComp = new JButton("Comprobar");
			btnComp.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
				btnComp();
			}
		});
			btnComp.setBounds(33, 150, 425, 29);
				add(btnComp);
		
		
		
		JButton button = new JButton("<< Atras");
				button.addActionListener(new ActionListener() {
		
					public void actionPerformed(ActionEvent e) {
						btnAtr();
			}
		});
				button.setBounds(33, 334, 117, 29);
					add(button);
	}
	
	private void btnComp(){
		valreturn = ingreso.getCod(Integer.parseInt(txtFID.getText()), tct1App.getText());
			txtMD.setText(valreturn);
	}
	
	private void btnAtr(){
		CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
			layout.show(ventana.getContentPane(), "PanelEquipo");
	}
}

