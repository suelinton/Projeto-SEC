

package projeto.sec.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projeto.sec.model.Urna;
import projeto.sec.model.Zona;


public class Urna_Persistencia {
    private static ConexaoMySQL BD = new ConexaoMySQL();
    private static Connection con;
    private static Statement stm;
    private static ResultSet rs;
    
    public static boolean save(Urna urna) {
		System.out.println("salvando");
		con = BD.getConnection();
                String insert = "INSERT INTO eleicao.urna(Numero_Urna,Numero_Votos_Urna,Localização)"+
                                "VALUES ("+urna.getNumero_urna()+","+
                                urna.getNumero_votos_urna()+","+
                                "'"+urna.getLocalização()+"')";
                System.out.println(insert);
		try {
			stm = con.createStatement();
			stm.execute(insert);
			
                        rs = stm.executeQuery("select * from urna");
			while (rs.next()){
				int Numero_urna = rs.getInt("Numero_Urna");//nome da coluna
                                int votos_urna = rs.getInt("Numero_Votos_Urna");
				String localizacao = rs.getString("Localização");
				
				System.out.println(">>>  " + Numero_urna +" | "+ votos_urna  +" | "+ localizacao );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
