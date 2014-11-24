/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.sec.model;

/**
 *
 * @author Tom
 */
public class Urna {

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
    }

    public int getNumero_votos_urna() {
        return numero_votos_urna;
    }

    public void setNumero_votos_urna(int numero_votos_urna) {
        this.numero_votos_urna = numero_votos_urna;
    }

    public int getNumero_urna() {
        return numero_urna;
    }

    public void setNumero_urna(int numero_urna) {
        this.numero_urna = numero_urna;
    }
    private String localização;
    private int numero_votos_urna;
    private int numero_urna;
}
