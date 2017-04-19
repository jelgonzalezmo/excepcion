/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondexcepciones;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Gestiondexcepciones {

    double dividirporcero(int denominador) throws ExceptionPersonalizadas {

        double resultado = 0;
        if (denominador == 0) {
            throw new ExceptionPersonalizadas("sdsdf");
        }

        resultado = (25 / denominador);
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestiondexcepciones excepciones = new Gestiondexcepciones();
        int denominador = 0;
        double resultado = 0;
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            denominador = lectura.nextInt();
            try {
                resultado = excepciones.dividirporcero(denominador);
            } catch (ExceptionPersonalizadas e) {
                System.out.println(e.getMessage());
            }
            System.out.println(resultado);
        }

    }

}
