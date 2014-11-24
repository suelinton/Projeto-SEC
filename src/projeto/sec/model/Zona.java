/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto.sec.model;

/**
 *
 * @author Rodrigo
 */
public class Zona {

    public int getZona() {
        return Zona;
    }

    public void setZona(int Zona) {
        this.Zona = Zona;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getVotos() {
        return Votos;
    }

    public void setVotos(int Votos) {
        this.Votos = Votos;
    }
    private int Zona;
    private String Estado;
    private String Endereco;
    private int Votos;
}
