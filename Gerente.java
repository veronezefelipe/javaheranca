/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaheranca;

/**
 *
 * @author Usuario
 */
public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String departamento, double salario, String nome) {
        super(salario, nome);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "departamento=" + departamento + '}';
    }
    
    
}
