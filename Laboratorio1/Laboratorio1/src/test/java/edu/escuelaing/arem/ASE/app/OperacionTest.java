package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

public class OperacionTest{

    @Test
    public void SumatoriaTest(){
        double valorTotal = 6389;
        double valorPrueba1 = 186;
        double valorPrueba2 = 699;
        double valorPrueba3 = 132;
        double valorPrueba4 = 272;
        double valorPrueba5 = 291;
        double valorPrueba6 = 331;
        double valorPrueba7 = 199;
        double valorPrueba8 = 1890;
        double valorPrueba9 = 788;
        double valorPrueba10 = 1601;
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        lista.add(valorPrueba4);
        lista.add(valorPrueba5);
        lista.add(valorPrueba6);
        lista.add(valorPrueba7);
        lista.add(valorPrueba8);
        lista.add(valorPrueba9);
        lista.add(valorPrueba10);
        double total = Operacion.Sum(lista);
        assertTrue(valorTotal == total);
    }

    @Test
    public void PromedioTest(){
        double valorTotal = 638.9;
        double valorPrueba1 = 186;
        double valorPrueba2 = 699;
        double valorPrueba3 = 132;
        double valorPrueba4 = 272;
        double valorPrueba5 = 291;
        double valorPrueba6 = 331;
        double valorPrueba7 = 199;
        double valorPrueba8 = 1890;
        double valorPrueba9 = 788;
        double valorPrueba10 = 1601;
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        lista.add(valorPrueba4);
        lista.add(valorPrueba5);
        lista.add(valorPrueba6);
        lista.add(valorPrueba7);
        lista.add(valorPrueba8);
        lista.add(valorPrueba9);
        lista.add(valorPrueba10);
        double total = Operacion.Promedio(lista);
        assertTrue(valorTotal == total);
    }

    @Test
    public void SumatoriaETest(){
        double valorTotal = 3522761.90;
        double valorPrueba1 = 186;
        double valorPrueba2 = 699;
        double valorPrueba3 = 132;
        double valorPrueba4 = 272;
        double valorPrueba5 = 291;
        double valorPrueba6 = 331;
        double valorPrueba7 = 199;
        double valorPrueba8 = 1890;
        double valorPrueba9 = 788;
        double valorPrueba10 = 1601;
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        lista.add(valorPrueba4);
        lista.add(valorPrueba5);
        lista.add(valorPrueba6);
        lista.add(valorPrueba7);
        lista.add(valorPrueba8);
        lista.add(valorPrueba9);
        lista.add(valorPrueba10);
        double total = Operacion.SumEsp(lista,Operacion.Promedio(lista));
        double valorDelta = 1;
        double valorPorDecimales = Math.abs(total - valorTotal);
        assertTrue(valorDelta == valorPorDecimales);
    }

    @Test
    public void SumatoriaVariacionEstandarTest(){
        double valorTotal = 625.633981;
        double valorPrueba1 = 186;
        double valorPrueba2 = 699;
        double valorPrueba3 = 132;
        double valorPrueba4 = 272;
        double valorPrueba5 = 291;
        double valorPrueba6 = 331;
        double valorPrueba7 = 199;
        double valorPrueba8 = 1890;
        double valorPrueba9 = 788;
        double valorPrueba10 = 1601;
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        lista.add(valorPrueba4);
        lista.add(valorPrueba5);
        lista.add(valorPrueba6);
        lista.add(valorPrueba7);
        lista.add(valorPrueba8);
        lista.add(valorPrueba9);
        lista.add(valorPrueba10);
        double total = Operacion.DesviacionEstandar(lista);
        total = Math.round(total * 1000000d)/1000000d;
        assertTrue(valorTotal == total);
    }



}