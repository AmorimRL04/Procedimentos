package Exercicios.Procedimentos;

import javax.swing.*;

public class EX88 {
    public static void Gerador(String mensagem, int repeticoes) {
        String resultado = "+ ======= +\n";

        for (int i = 0; i < repeticoes; i++) {
            resultado += mensagem + "\n";
        }

        resultado += "+ ======= +";

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX88 - Crie um programa que melhore o procedimento Gerador() da" +
                "\nquestão anterior para que mostre uma mensagem várias vezes," +
                "\nEx: Ao chamar Gerador(\"Aprendendo Portugol\", 4) aparece:" +
                "\n+ ======= +" +
                "\nAprendendo  Portugol" +
                "\nAprendendo  Portugol" +
                "\nAprendendo  Portugol" +
                "\nAprendendo  Portugol" +
                "\n+ ======= +");

        String passos = "1º Passo - Exibe os passos para o usuário" +
                "\n2º Passo - Solicita ao usuário para digitar a mensagem." +
                "\n3º Passo - Solicita ao usuário para definir o número de repetições" +
                "\n4º Passo - Exibir a linha superior." +
                "\n5º Passo - Exibir a mensagem repetidamente." +
                "\n6º Passo - Exibir a linha inferior." +
                "\n7º Passo - Chamar o procedimento Gerador() no método principal." +
                "\n8º Passo - Exibir o resultado da execução do procedimento Gerador.";

        JOptionPane.showMessageDialog(null, passos);

        String mensagem = JOptionPane.showInputDialog("Digite a mensagem que deseja exibir:");

        int repeticoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes deseja exibir a mensagem?"));

        Gerador(mensagem, repeticoes);
    }
}
