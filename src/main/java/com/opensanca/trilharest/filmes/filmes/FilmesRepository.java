package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface FilmesRepository {

    Pagina<Filme> buscarPaginaEmExibicao(
            ParametrosDePaginacao parametrosDePaginacao);

    Filme buscaPorId(UUID id);

}
