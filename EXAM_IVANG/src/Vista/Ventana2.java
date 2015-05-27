package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JPanel {
	private JTextField cnombre;
	private JTextField c1apellido;
	private JTextField c2apellido;
	private JTextField cnacionalidad;
	private JTextField eid;

	/**
	 * Create the panel.
	 */
	public Ventana2(JPanel card) {
		setLayout(null);
		
		JLabel tequipo = new JLabel("Equipo");
		tequipo.setBounds(24, 32, 89, 14);
		add(tequipo);
		
		JLabel tnombre = new JLabel("Nombre");
		tnombre.setBounds(173, 32, 89, 14);
		add(tnombre);
		
		JLabel t1apellido = new JLabel("1er Apellido");
		t1apellido.setBounds(173, 82, 89, 14);
		add(t1apellido);
		
		JLabel t2apellido = new JLabel("2\u00BA Apellido");
		t2apellido.setBounds(173, 138, 89, 14);
		add(t2apellido);
		
		JLabel tnacionalidad = new JLabel("Nacionalidad");
		tnacionalidad.setBounds(173, 206, 89, 14);
		add(tnacionalidad);
		
		JLabel tid = new JLabel("ID");
		tid.setBounds(328, 42, 78, 14);
		add(tid);
		
		JButton batras = new JButton("Atras");
		batras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		batras.setBounds(24, 242, 89, 23);
		add(batras);
		
		JButton bsiguiente = new JButton("Siguiente");
		bsiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bsiguiente.setBounds(320, 242, 101, 23);
		add(bsiguiente);
		
		JComboBox cequipo = new JComboBox();
		cequipo.setBounds(24, 58, 118, 20);
		add(cequipo);
		
		cnombre = new JTextField();
		cnombre.setBounds(173, 50, 89, 20);
		add(cnombre);
		cnombre.setColumns(10);
		
		c1apellido = new JTextField();
		c1apellido.setBounds(173, 107, 101, 20);
		add(c1apellido);
		c1apellido.setColumns(10);
		
		c2apellido = new JTextField();
		c2apellido.setBounds(173, 163, 118, 20);
		add(c2apellido);
		c2apellido.setColumns(10);
		
		cnacionalidad = new JTextField();
		cnacionalidad.setBounds(173, 232, 101, 20);
		add(cnacionalidad);
		cnacionalidad.setColumns(10);
		
		eid = new JTextField();
		eid.setBounds(320, 57, 86, 20);
		add(eid);
		eid.setColumns(10);

	}
}