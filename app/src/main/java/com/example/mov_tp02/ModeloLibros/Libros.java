package com.example.mov_tp02.ModeloLibros;

import java.io.Serializable;

public class Libros implements Serializable {
    private String autor;
    private String editorial;
    private String descripcion;
    private String etiqueta;
    private int anio;
    private int paginas;
    private int foto;

    public Libros(String autor, String editorial, String descripcion, String etiqueta, int anio, int paginas,int foto) {
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.etiqueta = etiqueta;
        this.anio = anio;
        this.paginas = paginas;
        this.foto= foto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
