package br.mpfn.repository;

import br.mpfn.model.Comentarios;
import br.mpfn.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentariosRepository extends JpaRepository<Comentarios, Long> {
}
