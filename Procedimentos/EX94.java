package Exercicios.Procedimentos;

import javax.swing.*;

public class EX94 {
    public static void Fibonacci(int termos) {
        int a = 0, b = 1;
        String resultado = "Fibonacci: ";

        for (int i = 1; i <= termos; i++) {
            resultado += a + " >> ";
            int temp = a;
            a = b;
            b = temp + b;
        }

        resultado += "FIM";
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX94 - Desafio - Crie um aplicativo que tenha um procedimento chamado Fibonacci()" +
                "\nque recebe um único valor inteiro como parâmetro, indicando quantos termos da sequência serão mostrados.");

        String passos = "1º Passo - Solicitar ao usuário para digitar a quantidade de termos da sequência." +
                "\n2º Passo - Chamar o procedimento Fibonacci() e passar o número de termos." +
                "\n3º Passo - Exibir a sequência de Fibonacci gerada." +
                "\n4º Passo - Exibir 'FIM' ao final da sequência.";

        JOptionPane.showMessageDialog(null, passos);

        int termos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos da sequência de Fibonacci:"));

        JOptionPane.showMessageDialog(null, "Exibindo sequência de Fibonacci...");

        Fibonacci(termos);
    }
}
