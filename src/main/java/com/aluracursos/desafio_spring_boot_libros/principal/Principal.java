package com.aluracursos.desafio_spring_boot_libros.principal;

import com.aluracursos.desafio_spring_boot_libros.model.Datos;
import com.aluracursos.desafio_spring_boot_libros.service.ConsumoAPI;
import com.aluracursos.desafio_spring_boot_libros.service.ConvierteDatos;

public class Principal {
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private static final String URL_BASE = "https://gutendex.com/books/";
    public void muestraElMenu() {
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);
    }
}
