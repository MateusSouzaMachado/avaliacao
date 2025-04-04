package com.senai.avaliacao.models;


import com.senai.avaliacao.dtos.MovimentoDTO;
import com.senai.avaliacao.enums.Classificacao;
import jakarta.persistence.*;


import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_movimentos")
public class Movimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_movimento")
    private Date dataMovimento;
    private Double valor;
    @Enumerated(EnumType.STRING)
    private Classificacao classificacao;
    private String observacao;

    public Movimento() {
    }

    public Movimento(Long id, Date dataMovimento, Double valor, Classificacao classificacao, String observacao) {
        this.id = id;
        this.dataMovimento = dataMovimento;
        this.valor = valor;
        this.classificacao = classificacao;
        this.observacao = observacao;
    }

    public Movimento(MovimentoDTO movimentoDTO) {
        this.id = movimentoDTO.getId();
        this.dataMovimento = movimentoDTO.getDataMovimento();
        this.valor = movimentoDTO.getValor();
        this.classificacao = movimentoDTO.getClassificacao();
        this.observacao = movimentoDTO.getObservacao();
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movimento movimento = (Movimento) o;
        return Objects.equals(id, movimento.id) && Objects.equals(dataMovimento, movimento.dataMovimento) && Objects.equals(valor, movimento.valor) && classificacao == movimento.classificacao && Objects.equals(observacao, movimento.observacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataMovimento, valor, classificacao, observacao);
    }
}
