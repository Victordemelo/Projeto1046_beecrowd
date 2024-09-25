/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1046 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int h_inicial, h_final, horas_positivas, horas_negativas;

        h_inicial = leitor.nextInt();
        h_final = leitor.nextInt();

        if (h_inicial > h_final) {
            horas_positivas = (24 - h_inicial) + h_final;
            System.out.println("O JOGO DUROU " + horas_positivas + " HORA(S)");
        } else {
            if (h_final > h_inicial) {
                horas_negativas = h_final - h_inicial;
                System.out.println("O JOGO DUROU " + horas_negativas + " HORA(S)");
            } else {
                System.out.println("O JOGO DUROU 24 HORA(S)");
            }
        }
    }
}