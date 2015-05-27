package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana1 extends JPanel {
	private JTextField enombre;
	private JTextField eid;
	private JTextField eapellidos;
	private JTextField eedad;
	private JTextField enacionalidad;

	/**
	 * Create the panel.
	 */
	public Ventana1(JPanel card) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ventana1.class.getResource("/img/usuario.png")));
		lblNewLabel.setBounds(34, 28, 125, 136);
		add(lblNewLabel);
		
		JLabel tnombre = new JLabel("Nombre");
		tnombre.setBounds(184, 28, 84, 14);
		add(tnombre);
		
		JLabel tid = new JLabel("ID");
		tid.setBounds(321, 28, 86, 14);
		add(tid);
		
		JLabel tapellidos = new JLabel("Apellidos");
		tapellidos.setBounds(184, 84, 84, 14);
		add(tapellidos);
		
		JLabel tedad = new JLabel("Edad");
		tedad.setBounds(184, 140, 84, 14);
		add(tedad);
		
		JLabel tnacionalidad = new JLabel("Nacionalidad");
		tnacionalidad.setBounds(184, 196, 84, 14);
		add(tnacionalidad);
		
		enombre = new JTextField();
		enombre.setEditable(false);
		enombre.setBounds(182, 53, 86, 20);
		add(enombre);
		enombre.setColumns(10);
		
		eid = new JTextField();
		eid.setBounds(321, 53, 86, 20);
		add(eid);
		eid.setColumns(10);
		
		eapellidos = new JTextField();
		eapellidos.setEditable(false);
		eapellidos.setBounds(184, 109, 86, 20);
		add(eapellidos);
		eapellidos.setColumns(10);
		
		eedad = new JTextField();
		eedad.setEditable(false);
		eedad.setBounds(184, 165, 86, 20);
		add(eedad);
		eedad.setColumns(10);
		
		enacionalidad = new JTextField();
		enacionalidad.setEditable(false);
		enacionalidad.setBounds(184, 221, 86, 20);
		add(enacionalidad);
		enacionalidad.setColumns(10);
		
		JButton bsiguiente = new JButton("Siguiente");
		bsiguiente.setBounds(318, 263, 89, 23);
		add(bsiguiente);

	}
}