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
public class Secao {
    private int num_secao;
    private int num_zona;
    private int votos;
    private String localizacao;
    private int qtdEleitores;

    public int getNum_secao() {
        return num_secao;
    }

    public void setNum_secao(int num_secao) {
        this.num_secao = num_secao;
    }

    public int getNum_zona() {
        return num_zona;
    }

    public void setNum_zona(int num_zona) {
        this.num_zona = num_zona;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQtdEleitores() {
        return qtdEleitores;
    }

    public void setQtdEleitores(int qtdEleitores) {
        this.qtdEleitores = qtdEleitores;
    }
}
