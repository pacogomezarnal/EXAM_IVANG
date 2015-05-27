package Controlador;

import java.util.ArrayList;

import Modelo.Cadete;
import Modelo.ModeloCadete;

public class CadeteController {

	private ModeloCadete mc;
	
	public CadeteController() {
			mc = new ModeloCadete();
	}
	
	public ArrayList<Cadete> loadCadetes(){
			return mc.load();
	}
	
	public Cadete loadMiCadete(){
			return mc.loadMiCadete();
	}

}
