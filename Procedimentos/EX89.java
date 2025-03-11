package Exercicios.Procedimentos;

import javax.swing.*;

public class EX89 {
    public static void Gerador(String mensagem, int repeticoes, int bordaEscolhida) {
        String linhaSuperior = "";
        String linhaInferior = "";

        switch (bordaEscolhida) {
            case 1:
                linhaSuperior = "+-------=======------+";
                linhaInferior = "+-------=======------+";
                break;
            case 2:
                linhaSuperior = "~~~~~~~~:::::::~~~~~~~";
                linhaInferior = "~~~~~~~~:::::::~~~~~~~";
                break;
            case 3:
                linhaSuperior = "<<<<<<<<<------>>>>>>>";
                linhaInferior = "<<<<<<<<<------>>>>>>>";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Borda inválida, escolha 1, 2 ou 3.");
                return;
        }

        String resultado = linhaSuperior + "\n";

        for (int i = 0; i < repeticoes; i++) {
            resultado += mensagem + "\n";
        }

        resultado += linhaInferior;

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX89 - Crie um programa que melhore o procedimento Gerador() da" +
                "\nquestão anterior para que o programador possa escolher uma entre" +
                "\ntrês bordas:\n" +
                "+-------=======------+ Borda 1\n" +
                "~~~~~~~~:::::::~~~~~~~ Borda 2\n" +
                "<<<<<<<<<------>>>>>> Borda 3\n" +
                "Ex: Uma chamada válida seria Gerador(\"Portugol Studio\", 3, 2)");

        String passos = "1º Passo - Exibe os passos para o usuário" +
                "\n2º Passo - Solicita ao usuário para digitar a mensagem." +
                "\n3º Passo - Solicita ao usuário para definir o número de repetições." +
                "\n4º Passo - Solicita ao usuário para escolher a borda." +
                "\n5º Passo - Exibir a linha superior com base na borda escolhida." +
                "\n6º Passo - Exibir a mensagem repetidamente." +
                "\n7º Passo - Exibir a linha inferior." +
                "\n8º Passo - Exibir o resultado da execução do procedimento Gerador.";


        JOptionPane.showMessageDialog(null, passos);

        String mensagem = JOptionPane.showInputDialog("Digite a mensagem que deseja exibir:");

        int repeticoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes deseja exibir a mensagem?"));

        int bordaEscolhida = Integer.parseInt(JOptionPane.showInputDialog("Escolha a borda (1, 2 ou 3):"));

        Gerador(mensagem, repeticoes, bordaEscolhida);
    }
}
