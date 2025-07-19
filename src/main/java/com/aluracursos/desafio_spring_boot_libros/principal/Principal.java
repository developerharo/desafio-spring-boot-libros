package com.aluracursos.desafio_spring_boot_libros.principal;

import com.aluracursos.desafio_spring_boot_libros.model.Datos;
import com.aluracursos.desafio_spring_boot_libros.model.DatosLibros;
import com.aluracursos.desafio_spring_boot_libros.service.ConsumoAPI;
import com.aluracursos.desafio_spring_boot_libros.service.ConvierteDatos;

import java.util.Comparator;

public class Principal {
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private static final String URL_BASE = "https://gutendex.com/books/";
    public void muestraElMenu() {
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

    // Top 10 libros mas descargados
        System.out.println("Top 10 libros más descargados");
        datos.resultados().stream()
                .sorted(Comparator.comparing(DatosLibros::numeroDeDescargas).reversed())
                .limit(10)
                .map(l -> l.titulo().toUpperCase())
                .forEach(System.out::println);


    }
}
