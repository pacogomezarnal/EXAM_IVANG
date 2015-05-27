package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
	
	// Cambiado el método de conexión a la BD
	
	private Connection conexion;
	private String CONTROLADOR_MYSQL="com.mysql.jdbc.Driver";
	private String server="localhost";
	private String bbdd="thelaby";
	private String user="root";
	private String pass="tonphp";
	private static ConexionDB instance=null;
	

	private ConexionDB(){
		try {
			Class.forName(CONTROLADOR_MYSQL).newInstance();
				System.out.println("Carga correcta");
		} 
		catch (Exception errorCargaControlador) {
			errorCargaControlador.printStackTrace();
				System.out.println("Error al cargar el controlador..");
		}
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://"+server+"/"+bbdd+"?"+"user="+user+"&password="+pass);
				System.out.println("Conectado");
		} 
		catch (SQLException errorConexionBBDD) {
			// TODO Auto-generated catch block
			errorConexionBBDD.printStackTrace();
				System.out.println("Error al conectar");
		}
	}
	
	public Connection getConexion() {
		return conexion;
	}

	public static ConexionDB getInstance() {
		if(instance==null) {
			instance=new ConexionDB();
		}
		return instance;
	}
		

		//Selects
	public ResultSet query(String query){
		
		Statement st;
		ResultSet rs = null;

		try {
			st = conexion.createStatement();
			try{
				rs = st.executeQuery(query);
			}
			
			catch (SQLException e){
				e.printStackTrace();
			}
		
		}
		catch (SQLException e1) {
				// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		return rs;	
										
	}
	
	//Inserts, Update  and Deletes.
	public int modifyQuery(String update){
		Statement stm;
		int rs = 0;
		try{
			stm = conexion.createStatement();		
			try{
				rs = stm.executeUpdate(update);
			}
			catch (SQLException e){
				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}
}