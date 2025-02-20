/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagamento;

/**
 *
 * @author aniii
 */
class TrabalhadorAssalariado extends Trabalhador {
    private double salario;
    
    public TrabalhadorAssalariado(String nome, String numeroSeguroSocial, double salario) {
        super(nome, numeroSeguroSocial);
        this.salario = salario;
    }

    public double getSalario(){
    return salario;
}
public void setSalario (double salario){
    this.salario = salario;
}
@Override
public double valorPagamento ()
{
return getSalario ();
}
@Override
public String toString ()
{
return String.format ("Trabalhador: %s \n %s: $%, .2f", super.toString(), "salario mensal", getSalario());
}
}
  