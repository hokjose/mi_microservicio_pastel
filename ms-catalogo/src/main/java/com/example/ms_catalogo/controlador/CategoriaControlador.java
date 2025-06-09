package com.example.ms_catalogo.controlador;

import com.example.ms_catalogo.entity.Categoria;
import com.example.ms_catalogo.repositorio.CategoriaRepositorio;
import com.example.ms_catalogo.servicios.CategoriaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Autowired
    private CategoriaServicios categoriaServicios;

    @GetMapping()
    public ResponseEntity<List<Categoria>> list(){
        return ResponseEntity.ok().body(categoriaServicios.listar());
    }
    @PostMapping()
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaServicios.guardar(categoria));
    }
    @PutMapping()
    public ResponseEntity<Categoria> update(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaServicios.actualizar(categoria));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> listarId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(categoriaServicios.listarPorId(id).get());

    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        categoriaServicios.eliminarPorId(id);
        return "eliminacion correcta miking";
    }



}
