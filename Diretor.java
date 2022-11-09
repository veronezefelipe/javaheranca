/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaheranca;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Diretor extends Funcionario{
    private double participacaoLucros;

    public Diretor(double participacaoLucros, double salario, String nome) {
        super(salario, nome);
        this.participacaoLucros = participacaoLucros;
    }
    public int obterMes(){
        Date data = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        return c.get(Calendar.MONTH);
    }
    public double calcularSalario(){
        if (obterMes() == 6 || obterMes() == 12)
            return salario + participacaoLucros;
        return salario;
    }

    @Override
    public String toString() {
        return "Diretor{" + "participacaoLucros=" + participacaoLucros + '}';
    }
}
