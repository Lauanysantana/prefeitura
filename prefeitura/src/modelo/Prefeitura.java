/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Prefeitura {
    private int nr_funci;
    private String endereco;
    private String nome;
    private int codigo;

    public int getNr_funci() {
        return nr_funci;
    }

    public void setNr_funci(int nr_funci) {
        this.nr_funci = nr_funci;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Prefeitura{" + "nome=" + nome + '}';
    }
    
}
