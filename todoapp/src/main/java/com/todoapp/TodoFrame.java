package com.todoapp;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.List;

public class TodoFrame extends JFrame {
    private final DefaultListModel<Tarefa> model = new DefaultListModel<>();
    private final JList<Tarefa> listaTarefas = new JList<>(model);
    private final JTextField campoTexto = new JTextField();

    public TodoFrame() {
        setTitle("Todo App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 420);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Lista de tarefas", SwingConstants.CENTER);
        titulo.setFont(titulo.getFont().deriveFont(20f));

        JPanel painelSuperior = new JPanel(new BorderLayout(10, 10));
        painelSuperior.add(titulo, BorderLayout.NORTH);

        campoTexto.setPreferredSize(new Dimension(350, 35));
        JButton botaoAdicionar = new JButton("Adicionar");
        JButton botaoConcluir = new JButton("Concluir/Desmarcar");
        JButton botaoRemover = new JButton("Remover");

        JPanel painelEntrada = new JPanel(new BorderLayout(10, 10));
        painelEntrada.add(campoTexto, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        painelBotoes.add(botaoAdicionar);
        painelBotoes.add(botaoConcluir);
        painelBotoes.add(botaoRemover);

        painelSuperior.add(painelEntrada, BorderLayout.CENTER);
        painelSuperior.add(painelBotoes, BorderLayout.SOUTH);

        add(painelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(listaTarefas), BorderLayout.CENTER);

        botaoAdicionar.addActionListener(e -> adicionarTarefa());
        botaoConcluir.addActionListener(e -> concluirTarefa());
        botaoRemover.addActionListener(e -> removerTarefa());

        carregarTarefas();
    }

    private void carregarTarefas() {
        try {
            DatabaseManager.init();
            List<Tarefa> tarefas = DatabaseManager.listarTarefas();
            model.clear();
            for (Tarefa tarefa : tarefas) {
                model.addElement(tarefa);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar tarefas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void adicionarTarefa() {
        String texto = campoTexto.getText().trim();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite uma tarefa antes de adicionar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            DatabaseManager.adicionarTarefa(texto);
            campoTexto.setText("");
            carregarTarefas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar tarefa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void concluirTarefa() {
        Tarefa selecionada = listaTarefas.getSelectedValue();
        if (selecionada == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para concluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            DatabaseManager.alternarConcluida(selecionada.getId());
            carregarTarefas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar tarefa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removerTarefa() {
        Tarefa selecionada = listaTarefas.getSelectedValue();
        if (selecionada == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para remover.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            DatabaseManager.removerTarefa(selecionada.getId());
            carregarTarefas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao remover tarefa: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
