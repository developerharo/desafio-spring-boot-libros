package com.aluracursos.desafio_spring_boot_libros.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
