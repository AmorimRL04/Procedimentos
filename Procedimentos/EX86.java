package Exercicios.Procedimentos;

import javax.swing.*;

public class EX86 {
    public static void Gerador(String mensagem, int repeticoes) {
        String resultado = "+ ======= +\n";

        for (int i = 0; i < repeticoes; i++) {
            resultado += mensagem + "\n";
        }

        resultado += "+ ======= +";

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX86 - Crie um programa que tenha um procedimento Gerador() que," +
                "\nquando chamado, mostre a mensagem &quot;Olá, Mundo!&quot; com algum" +
                "\ncomponente visual (linhas)" +
                "\nEx: Ao chamar Gerador() aparece:" +
                "\n+ ======= +" +
                "\nOlá, Mundo!" +
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
