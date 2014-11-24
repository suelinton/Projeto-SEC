/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.sec.controlers;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Tom
 */
public class ItemConsulta {

    public JTextField getTx() {
        return tx;
    }

    public JComboBox getCb() {
        return cb;
    }

    private JTextField tx;
    private JComboBox cb;

    public ItemConsulta(JTextField tx,
            JComboBox cb) {
        this.tx = tx;
        this.cb = cb;
    }

    
    
    
}
