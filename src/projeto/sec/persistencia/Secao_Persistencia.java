

package projeto.sec.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projeto.sec.model.Secao;


public class Secao_Persistencia {
    private static ConexaoMySQL BD = new ConexaoMySQL();
    private static Connection con;
    private static Statement stm;
    private static ResultSet rs;
    
    public static boolean save(Secao secao) {
		System.out.println("salvando");
		con = BD.getConnection();
                String insert = "INSERT INTO eleicao.secao"+
                                "VALUES ("+secao.getNum_secao()+","+
                                secao.getNum_zona()+","+
                                secao.getVotos()+","+  
                                "'"+secao.getLocalizacao()+"'"+
                                secao.getQtdEleitores()+")";
                System.out.println(insert);
		try {
			stm = con.createStatement();
			stm.execute(insert);
			
                       /* rs = stm.executeQuery("select * from secao");
			while (rs.next()){
				int Numero_urna = rs.getInt("Numero_Urna");//nome da coluna
                                int votos_urna = rs.getInt("Numero_Votos_Urna");
				String localizacao = rs.getString("Localização");
				
				System.out.println(">>>  " + Numero_urna +" | "+ votos_urna  +" | "+ localizacao );
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
