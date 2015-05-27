package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana1 extends JPanel {
	private JTextField cnombre;
	private JTextField cid;
	private JTextField capellidos;
	private JTextField cedad;
	private JTextField cnacionalidad;

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
		
		cnombre = new JTextField();
		cnombre.setEditable(false);
		cnombre.setBounds(182, 53, 86, 20);
		add(cnombre);
		cnombre.setColumns(10);
		
		cid = new JTextField();
		cid.setBounds(321, 53, 86, 20);
		add(cid);
		cid.setColumns(10);
		
		capellidos = new JTextField();
		capellidos.setEditable(false);
		capellidos.setBounds(184, 109, 86, 20);
		add(capellidos);
		capellidos.setColumns(10);
		
		cedad = new JTextField();
		cedad.setEditable(false);
		cedad.setBounds(184, 165, 86, 20);
		add(cedad);
		cedad.setColumns(10);
		
		cnacionalidad = new JTextField();
		cnacionalidad.setEditable(false);
		cnacionalidad.setBounds(184, 221, 86, 20);
		add(cnacionalidad);
		cnacionalidad.setColumns(10);
		
		JButton bsiguiente = new JButton("Siguiente");
		bsiguiente.setBounds(318, 263, 89, 23);
		add(bsiguiente);

	}
}