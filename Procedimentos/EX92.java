package Exercicios.Procedimentos;

import javax.swing.*;

public class EX92 {
    public static void ParOuImpar(int numero) {
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é PAR.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ÍMPAR.");
        }
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX92 - Crie uma lógica que leia um número inteiro e" +
                "\npasse para um procedimento ParOuImpar() que vai verificar e mostrar na tela se o valor passado como parâmetro é PAR ou ÍMPAR.");

        String passos = "1º Passo - Solicitar ao usuário para digitar um número inteiro." +
                "\n2º Passo - Chamar o procedimento ParOuImpar() e passar o número como parâmetro." +
                "\n3º Passo - O procedimento ParOuImpar() irá verificar se o número é PAR ou ÍMPAR e exibir o resultado.";

        JOptionPane.showMessageDialog(null, passos);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        JOptionPane.showMessageDialog(null, "4º Passo - Exibindo o resultado...");

        ParOuImpar(numero);
    }
}
