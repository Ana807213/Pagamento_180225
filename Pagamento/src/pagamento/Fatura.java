/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

/**
 *
 * @author aniii
 */
    class Fatura implements Pagamento {
    private String identificador;
    private String descricao;
    private int quantidade;
    private double preco;
    
 public Fatura (String identificador, String descricao, int quantidade, double preco) {
this.identificador = identificador;
this.descricao = descricao;
this.quantidade = quantidade;
this.preco = preco;
}
public String getIdentificador(){
    return identificador;
}
public void setIdentificador (String identificador){
    this.identificador = identificador;
}
public String getDescricao(){
    return descricao;
}
public void setDescricao (String descricao){
    this.descricao = descricao;
}
public int getQuantidade(){
    return quantidade;
}
public void setQuantidade (int quantidade){
    this.quantidade = quantidade;
}
public double getPreco(){
    return preco;
}
public void setPreco (double preco){
    this.preco = preco;
}
@Override
public String toString ()
{
return String.format (" %s: \n %s: %s %s %s \n %s: %d \n %s: $%, .2f", "Fatura","Numero", getIdentificador(), "Descricao", getDescricao (),"Quantidade", getQuantidade (), "Valor", getPreco());
}
@Override
 public double valorPagamento()
{
return getQuantidade()*getPreco ();
}
}