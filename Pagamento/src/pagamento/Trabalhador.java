/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

/**
 *
 * @author aniii
 */
abstract class Trabalhador implements Pagamento {
    private String nome;
    private String numeroSeguroSocial;

public Trabalhador (String nome, String numeroSeguroSocial){
this.nome = nome;
this.numeroSeguroSocial = numeroSeguroSocial;
}
public String getNome(){
    return nome;
}
public void setNome (String nome){
    this.nome = nome;
}
public String getNumeroSeguroSocial(){
    return numeroSeguroSocial;
}
public void setNumeroSeguroSocial (String numeroSeguroSocial){
    this.numeroSeguroSocial = numeroSeguroSocial;
}
    @Override
    public String toString ()
{
return String.format (" %s \n numero social : %s", getNome (), getNumeroSeguroSocial ());
}
}