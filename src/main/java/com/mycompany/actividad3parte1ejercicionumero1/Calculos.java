/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte1ejercicionumero1;

/**
 *
 * @author Knoknozo
 */
public class Calculos {
    public static int SalarioBruto(){
        int NumHoras, ValorHora;
        NumHoras = 160;
        ValorHora = 30;
        return NumHoras*ValorHora;
    }
    public static double SalarioNeto(){
        double Porcentaje;
        Porcentaje = 0.12;
        return SalarioBruto()-(Porcentaje*SalarioBruto());
    }
}
