package com.senai.avaliacao.dtos;

import com.senai.avaliacao.enums.Classificacao;
import com.senai.avaliacao.models.Movimento;

import java.util.Date;
import java.util.Objects;

public class MovimentoDTO {

    private Long id;
    private Date dataMovimento;
    private Double valor;
    private Classificacao classificacao;
    private String observacao;

    public MovimentoDTO() {
    }

    public MovimentoDTO(Movimento movimento) {
        this.id = movimento.getId();
        this.dataMovimento = movimento.getDataMovimento();
        this.valor = movimento.getValor();
        this.classificacao = movimento.getClassificacao();
        this.observacao = movimento.getObservacao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MovimentoDTO that = (MovimentoDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(dataMovimento, that.dataMovimento) && Objects.equals(valor, that.valor) && classificacao == that.classificacao && Objects.equals(observacao, that.observacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataMovimento, valor, classificacao, observacao);
    }
}
