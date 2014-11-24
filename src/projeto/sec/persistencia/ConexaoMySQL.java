package projeto.sec.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

	private Connection con = null;
	private String hostName = null;
	private String userName = null;
	private String password = null;
	private String url = null;
	private String jdbcDriver = null;
	private String dataBaseName = null;
	private String dataBasePrefix = null;
	private String dabaBasePort = null;

	  /**
	   * Cosntrutor Padr�o
	   * 
	   */
	  public ConexaoMySQL() {
	    super();
	    /*
	     * Os dados setados abaixo servem para uma conex�o em MySQL.
	     * Altere de acordo com seu BD.
	     */
	    //"jdbc:mysql://localhost:3306/meu_bd";
	    hostName = "localhost";
	    userName = "root";
	    password = "0112";     
	    jdbcDriver = "com.mysql.jdbc.Driver";
	    dataBaseName = "eleicao";
	    dataBasePrefix = "jdbc:mysql://";
	    dabaBasePort = "3306";
	  
	    url = dataBasePrefix + hostName + ":"+dabaBasePort+"/" + dataBaseName ;//+ "/";
	    System.out.println(url);
	    /*
	     * Exemplo de um URL completo para MySQL:    
	     * a concatena��o acima deve ficar algo como:
	     * jdbc:mysql://localhost:3306/meu_bd
	     */
	  }

	  /**
	   * Retorna uma java.sql.Connection.
	   * @return con 
	   */
	  public Connection getConnection() {
		  try {
			  if (con == null) {
				  Class.forName(jdbcDriver);
				  con = DriverManager.getConnection(url, userName, password);
			  } else if (con.isClosed()) {
				  con = null;
				  return getConnection();
			  }
		  } catch (ClassNotFoundException e) {
			  //TODO: use um sistema de log apropriado.
			  e.printStackTrace();
		  } catch (SQLException e) {
			  //TODO: use um sistema de log apropriado.
			  e.printStackTrace();
		  }
		  return con;
	  }

	  /**
	   * Fecha a conex�o com BD.
	   *
	   */
	  public void closeConnection() {
		  if (con != null) {
			  try {
				  con.close();
			  } catch (SQLException e) {
			  }
		  }
	  }

      
       
}
