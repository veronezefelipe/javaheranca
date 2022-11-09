/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaheranca;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(700, "Thiago");
        Gerente g1 = new Gerente("RH", 1000, "Vero");
        Vendedor v1 = new Vendedor(0.3, 1000, "Teta");
        Diretor d1 = new Diretor(10000,12000, "Vero");
        
        System.out.println(d1);
    }
}
