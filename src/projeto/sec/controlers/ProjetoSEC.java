/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.sec.controlers;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Tom
 */
public class ProjetoSEC {

    public Vector<String> opcao_de_consuta = new Vector<String>();

    public ProjetoSEC() {
        opcao_de_consuta.add("nome");
        opcao_de_consuta.add("partido");
        opcao_de_consuta.add("numero");
        opcao_de_consuta.add("sessão");
        opcao_de_consuta.add("zona");
    }

}
