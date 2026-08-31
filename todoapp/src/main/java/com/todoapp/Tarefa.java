package com.todoapp;

public class Tarefa {
    private final int id;
    private final String titulo;
    private final boolean concluida;

    public Tarefa(int id, String titulo, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.concluida = concluida;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return (concluida ? "[X] " : "[ ] ") + titulo;
    }
}
