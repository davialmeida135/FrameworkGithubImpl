package com.projectmanager.service;

import java.util.Collection;

import com.projectmanager.entities.Comentario;
import com.projectmanager.model.ComentarioModel;

public interface ComentarioService {
    public Iterable<Comentario> findAll();
    public Comentario find(int id);
    public Comentario save(int tarefaId, String userName, String message);
    public void delete(int id);
    public void deleteComentariosTarefa(int idTarefa);
    public Collection<ComentarioModel> getComentarioTarefa(int tarefaId);
}
