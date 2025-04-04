package com.senai.avaliacao.resources;

import com.senai.avaliacao.dtos.MovimentoDTO;
import com.senai.avaliacao.models.Movimento;
import com.senai.avaliacao.services.MovimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movimentos")
public class MovimentoResourse {
    @Autowired
    private MovimentoService movimentoService;

    @GetMapping("{id}")
    public ResponseEntity<MovimentoDTO> buscarMovimentoPorId(@PathVariable Long id) {
        Movimento movimento = movimentoService.buscarMovimentoPorId(id);
        return ResponseEntity.ok(new MovimentoDTO(movimento));
    }

    @PostMapping()
    public ResponseEntity<MovimentoDTO> criarMovimento(@RequestBody MovimentoDTO movimentoDTO) {
        return ResponseEntity.ok(movimentoService.salvarMovimento(movimentoDTO));
    }

    @PutMapping()
    public ResponseEntity<MovimentoDTO> atualizarMovimento(@RequestBody MovimentoDTO movimentoDTO) {
        return ResponseEntity.ok(movimentoService.atualizarMovimento(movimentoDTO));
    }

    @DeleteMapping()
    public ResponseEntity<Void> deletarMovimento(@RequestBody MovimentoDTO movimentoDTO) {
        movimentoService.deletarMovimento(movimentoDTO.getId());
        return ResponseEntity.noContent().build();
    }
}
