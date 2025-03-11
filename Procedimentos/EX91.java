package Exercicios.Procedimentos;

import javax.swing.*;

public class EX91 {
    public static void Maior(int num1, int num2) {
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais.");
        }
        else if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        }
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX91 - Desenvolva um algoritmo que leia dois valores pelo teclado e" +
                "\npasse esses valores para um procedimento Maior() que vai verificar qual deles é o maior e mostrá-lo na tela." +
                "\nCaso os dois valores sejam iguais, mostrar uma mensagem informando essa característica.");

        String passos = "1º Passo - Solicitar ao usuário para digitar dois números." +
                "\n2º Passo - Chamar o procedimento Maior() e passar os dois números como parâmetros." +
                "\n3º Passo - O procedimento Maior() irá verificar qual número é o maior ou se os números são iguais.";

        JOptionPane.showMessageDialog(null, passos);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        Maior(num1, num2);
    }
}
