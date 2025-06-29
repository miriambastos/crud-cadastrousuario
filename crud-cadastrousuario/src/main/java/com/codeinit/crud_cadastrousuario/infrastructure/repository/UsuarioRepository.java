package com.codeinit.crud_cadastrousuario.infrastructure.repository;

import com.codeinit.crud_cadastrousuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

        Optional<Usuario> findByEmail(String email);

        @Transactional //Caso dê ERRO não pode deletar
        void deleteByEmail(String email);
}
