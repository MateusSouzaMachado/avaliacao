package com.senai.avaliacao.services;

import com.senai.avaliacao.dtos.MovimentoDTO;
import com.senai.avaliacao.models.Movimento;
import com.senai.avaliacao.repositories.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class MovimentoService {

    @Autowired
    private MovimentoRepository movimentoRepository;

    public Movimento buscarMovimentoPorId(Long id) {
        return movimentoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Movimento não encontrado"));
    }

    public MovimentoDTO salvarMovimento(MovimentoDTO movimentoDTO) {
        Movimento movimento = new Movimento(movimentoDTO);
        return new MovimentoDTO(movimentoRepository.save(movimento));
    }

    public MovimentoDTO atualizarMovimento(MovimentoDTO movimentoDTO) {
        if (isNull(movimentoDTO.getId())) {
            throw new IllegalArgumentException("Id não pode ser nulo");
        }
        Movimento movimento = movimentoRepository.findById(movimentoDTO.getId()).orElseThrow(() -> new IllegalArgumentException("Movimento não encontrado"));
        movimento = new Movimento(movimentoDTO);
        movimentoRepository.save(movimento);
        return new MovimentoDTO(movimento);
    }

    public void deletarMovimento(Long id){
        movimentoRepository.deleteById(id);
    }
}
