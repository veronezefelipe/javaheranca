/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaheranca;

/**
 *
 * @author Usuario
 */
public class Vendedor extends Funcionario{
    private double comissao;
    

    public Vendedor(double comissao , double salario, String nome) {
        super(salario, nome);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    private double calcularSalario(){
        return this.salario + this.salario*this.comissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", comissao=" + comissao*100 + ", salario completo" + calcularSalario();
    }
}
