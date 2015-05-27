package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Clase que comprueba el codigo de entrada
public class IngresoLaby {
	//CONSULTA A LA BASE DE DATOS
	private final static String CHECK_SEL="SELECT cod FROM cod WHERE id=";
	private final static String COD_COL="cod";
	
	//Conexion
	private Connection conexion = null;// maneja la conexion
	private Statement instruccion = null;
	private ResultSet resultados = null;

	public IngresoLaby() {
		//Obtenemos la conexion de datos
		ConexionDB con = ConexionDB.getInstance();
		conexion = con.getConexion();	
	}
	
	public String getCod(int id,String apellido){
		try{
			String cod="";
			instruccion = this.conexion.createStatement();
			resultados = instruccion.executeQuery(CHECK_SEL+String.valueOf(id));
			

			while(resultados.next() ) {
				if(apellido.equals(resultados.getString(COD_COL))) cod="CODIGO CORRECTO ENHORABUENA. LLAMA A TU INSTRUCTOR";
				else return cod="CODIGO INCORRECTO COMPRUEBA TODOS LOS PASOS";
			}// fin de while
			return cod;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return "ERROR EN LA CONEXION. LLAMA A TU INSTRUCTOR";
		}
		finally{
			try{
				resultados.close();
				instruccion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}	
	}

}
