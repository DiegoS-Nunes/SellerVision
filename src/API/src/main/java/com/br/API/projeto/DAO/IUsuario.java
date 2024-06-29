package com.br.API.projeto.DAO;

import org.springframework.data.repository.CrudRepository;
import com.br.API.projeto.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
