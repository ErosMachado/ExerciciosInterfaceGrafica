package br.com.fiap.exercicios;

import javax.swing.*;

public class BoasVindas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Boas-vindas"); // título da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150); // Tamanho da janela

        JLabel label = new JLabel("Bem-vindo ao Aplicativo Java!", SwingConstants.CENTER); // Mensagem centralizada
        frame.add(label);

        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }
}
