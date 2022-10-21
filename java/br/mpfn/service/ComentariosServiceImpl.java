package br.mpfn.service;

import br.mpfn.model.Comentarios;
import br.mpfn.model.Post;
import br.mpfn.repository.ComentariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class ComentariosServiceImpl {
    @Service
    public class  ComentariosServicelmpl implements  ComentariosService {

        @Autowired
        ComentariosRepository comentariosRepository;

        @Override
        public List<Comentarios> findAll() {
            return comentariosRepository.findAll();
        }

        @Override
        public Comentarios findById(Long id) {
            Comentarios func = comentariosRepository.findById(id).get();
            return func != null ? func : new Comentarios();
        }

        @Override
        public Comentarios save(Comentarios comentarios) {
            try {
                return comentariosRepository.save(comentarios);
            } catch (Exception e) {
                throw e;
            }
        }

        @Override
        public void deleteById(Long id) {
            try {
                comentariosRepository.deleteById(id);
            } catch (Exception e) {
                throw e;
            }
        }

    }
}

