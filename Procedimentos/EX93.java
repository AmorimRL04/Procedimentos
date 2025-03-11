package Exercicios.Procedimentos;

import javax.swing.*;

public class EX93 {

    public static void Contador(int inicio, int fim, int incremento) {
        String contagem = "Contagem: ";

        if (inicio < fim) {
            for (int i = inicio; i <= fim; i += incremento) {
                contagem += i + " ";
            }
        } else {
            for (int i = inicio; i >= fim; i -= incremento) {
                contagem += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null, contagem);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX93 - Crie um programa que tenha um procedimento chamado Contador()" +
                "\nque recebe três valores como parâmetro: o início, o fim e o incremento de uma contagem." +
                "\nO programa principal deve solicitar a digitação desses valores e passá-los ao procedimento, " +
                "\nque vai mostrar a contagem na tela." +
                "\nEx: Para os valores de início (4), fim (20) e incremento(3)" +
                "\nteremos Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13" +
                "\n>> 16 >> 19 >> FIM");

        String passos = "1º Passo - Solicitar ao usuário para digitar o valor de início da contagem." +
                "\n2º Passo - Solicitar ao usuário para digitar o valor do fim da contagem." +
                "\n3º Passo - Solicitar ao usuário para digitar o valor do incremento." +
                "\n4º Passo - Chamar o procedimento Contador() e passar os valores digitados." +
                "\n5º Passo - Exibir a contagem gerada pelo procedimento Contador().";

        JOptionPane.showMessageDialog(null, passos);

        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de início da contagem:"));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do fim da contagem:"));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do incremento:"));

        JOptionPane.showMessageDialog(null, "4º Passo - Exibindo a contagem...");

        Contador(inicio, fim, incremento);
    }
}
