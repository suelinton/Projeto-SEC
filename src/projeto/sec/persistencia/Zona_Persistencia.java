

package projeto.sec.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projeto.sec.model.Zona;


public class Zona_Persistencia {
    private static ConexaoMySQL BD = new ConexaoMySQL();
    private static Connection con;
    private static Statement stm;
    private static ResultSet rs;
    
    public static boolean save(Zona zona) {
		System.out.println("salvando");
		con = BD.getConnection();
                String insert_zona = "INSERT INTO eleicao.zona(Numero_Zona,votos_Zona,estado,endereço_Zona)"+
                                "VALUES ("+zona.getZona()+","+
                                zona.getVotos()+","+
                                "'"+zona.getEstado()+"',"+
                                "'"+zona.getEndereco()+"')";
                System.out.println(insert_zona);
		try {
			stm = con.createStatement();
			stm.execute(insert_zona);
			
                        rs = stm.executeQuery("select * from zona");
			while (rs.next()){
				int Numero_Zona = rs.getInt("Numero_Zona");//nome da coluna
                                int votos_Zona = rs.getInt("votos_Zona");
				String Estado = rs.getString("estado");//indice da coluna
				String Endereço = rs.getString("endereço_Zona");
				
				System.out.println(">>>  " + Numero_Zona +" | "+ votos_Zona  +" | "+ Estado +" | "+ Endereço );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
