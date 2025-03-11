package Exercicios.Procedimentos;

import javax.swing.*;

public class EX90 {
    public static void Somador(int num1, int num2) {
        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null, "A soma entre " + num1 + " e " + num2 + " é: " + soma);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX90 - Desenvolva um algoritmo que leia dois valores pelo teclado e" +
                "\npasse esses valores para um procedimento Somador() que vai calcular e mostrar a soma entre eles.");

        String passos = "1º Passo - Solicitar ao usuário para digitar dois números." +
                "\n2º Passo - Chamar o procedimento Somador() e passar os dois números como parâmetros." +
                "\n3º Passo - O procedimento Somador() irá calcular e mostrar a soma entre os dois números.";

        JOptionPane.showMessageDialog(null, passos);

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        Somador(num1, num2);
    }
}
