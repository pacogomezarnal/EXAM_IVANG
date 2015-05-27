package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana3 extends JPanel {
	private JTextField cid;
	private JTextField c1apellido;
	private JTextField tmensaje;

	/**
	 * Create the panel.
	 */
	public Ventana3(JPanel card) {
		setLayout(null);
		
		JLabel tid = new JLabel("ID");
		tid.setBounds(23, 58, 86, 14);
		add(tid);
		
		JLabel t1apellido = new JLabel("1er Apellido");
		t1apellido.setBounds(136, 58, 86, 14);
		add(t1apellido);
		
		cid = new JTextField();
		cid.setBounds(10, 83, 86, 20);
		add(cid);
		cid.setColumns(10);
		
		c1apellido = new JTextField();
		c1apellido.setBounds(136, 83, 134, 20);
		add(c1apellido);
		c1apellido.setColumns(10);
		
		JButton bcomprobar = new JButton("Comprobar");
		bcomprobar.setBounds(10, 170, 421, 23);
		add(bcomprobar);
		
		tmensaje = new JTextField();
		tmensaje.setEditable(false);
		tmensaje.setBounds(10, 218, 421, 20);
		add(tmensaje);
		tmensaje.setColumns(10);

	}

}