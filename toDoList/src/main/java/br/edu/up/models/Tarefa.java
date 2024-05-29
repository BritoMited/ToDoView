package br.edu.up.models;

import java.util.TreeMap;
import java.util.UUID;

public class Tarefa implements Escrita {
    private UUID uuid;
    private String titulo;
    private String descricao;
    private String prioridade;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, String prioridade, Usuario usuario) {
        this.uuid = UUID.randomUUID();
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.usuario = usuario;
    }

    private Usuario usuario;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void atualizarDados(Tarefa tarefa){
        this.titulo = tarefa.getTitulo();
        this.descricao = tarefa.getDescricao();
        this.prioridade = tarefa.getPrioridade();
        this.usuario = tarefa.getUsuario();
    }
    @Override
    public String toString() {
        return "Tarefa{" +
                "uuid=" + uuid +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", prioridade='" + prioridade + '\'' +
                ", usuario=" + usuario +
                '}';
    }

    @Override
    public String dadosFormatados() {
        return "Tarefa{" +
                "uuid=" + uuid +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", prioridade='" + prioridade + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
