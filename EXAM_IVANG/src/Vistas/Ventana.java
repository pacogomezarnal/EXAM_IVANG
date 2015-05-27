package Vistas;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	private VistaUsuario panUser;
	private VistaEquipo panEq;
	private VistaComprobacion panComp;
	
	public Ventana() {
		
		setTitle("IVAN GARCIA FERNANDEZ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 500, 400);	
		
			getContentPane().setLayout(new CardLayout(0, 0));
		
		
		panUser = new VistaUsuario(this);
			this.getContentPane().add("PanelUsuario", panUser);
			
				panEq = new VistaEquipo(this);
					this.getContentPane().add("PanelEquipo", panEq);
					
						panComp = new VistaComprobacion(this);
							this.getContentPane().add("PanelComprobacion", panComp);

		
		
		
	}

}
