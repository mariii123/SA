package br.mpfn.service;

import br.mpfn.model.Comentarios;
import br.mpfn.model.Post;

import java.util.List;

public interface ComentariosService {
    public List<Comentarios> findAll();
    public Comentarios save(Comentarios comentarios);
    public Comentarios findById(Long id);
    public void deleteById(Long id);
}
