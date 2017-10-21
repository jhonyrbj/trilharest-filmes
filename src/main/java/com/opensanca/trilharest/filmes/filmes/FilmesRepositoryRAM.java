package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class FilmesRepositoryRAM implements FilmesRepository {

    @Override
    public Pagina buscarPaginaEmExibicao(ParametrosDePaginacao parametrosDePaginacao) {
        return null;
    }

    @Override
    public Filme buscaPorId(UUID id) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
