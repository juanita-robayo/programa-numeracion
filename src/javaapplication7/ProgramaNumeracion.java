/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author sg702-18
 */
public class ProgramaNumeracion {

    enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        // Uso de la enumeración
        DiaSemana dia = DiaSemana.MIERCOLES;

        switch (dia) {
            case LUNES -> System.out.println("Es lunes, ánimo.");
            case MARTES -> System.out.println("Es martes, sigue adelante.");
            case MIERCOLES -> System.out.println("Ya es miércoles, mitad de semana.");
            case JUEVES -> System.out.println("Es jueves, casi llegamos.");
            case VIERNES -> System.out.println("¡Viernes al fin, fin de semana cerca!");
            case SABADO -> System.out.println("Es sábado, a disfrutar.");
            case DOMINGO -> System.out.println("Es domingo, relájate.");
            default -> System.out.println("Día no válido.");
        }
    }
}    
