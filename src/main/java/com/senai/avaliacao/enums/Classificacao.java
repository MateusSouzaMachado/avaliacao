package com.senai.avaliacao.enums;

public enum Classificacao {
    ENTRADA("Entrada"),
    SAIDA("Saída");

    private final String descricao;

    Classificacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
