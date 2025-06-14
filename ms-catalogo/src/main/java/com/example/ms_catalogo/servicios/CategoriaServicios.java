package com.example.ms_catalogo.servicios;

import com.example.ms_catalogo.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaServicios {
    public List<Categoria> listar ();
    public Categoria guardar(Categoria categoria);
    public Categoria actualizar(Categoria categoria);
    public Optional<Categoria> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
