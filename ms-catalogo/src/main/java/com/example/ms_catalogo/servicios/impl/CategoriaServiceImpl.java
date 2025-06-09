package com.example.ms_catalogo.servicios.impl;

import com.example.ms_catalogo.entity.Categoria;
import com.example.ms_catalogo.repositorio.CategoriaRepositorio;
import com.example.ms_catalogo.servicios.CategoriaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaServiceImpl implements CategoriaServicios {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Override
    public List<Categoria> listar() {
        return categoriaRepositorio.findAll();
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Optional<Categoria> listarPorId(Integer id) {
        return categoriaRepositorio.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
    categoriaRepositorio.deleteById(id);
    }
}
