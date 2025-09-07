package com.example.mov_tp02.Repository;

import com.example.mov_tp02.ModeloLibros.Libros;
import com.example.mov_tp02.R;

import java.util.Arrays;
import java.util.List;

public class LibrosRepository {

    public List<Libros> listaLibros= Arrays.asList(
            new Libros("uno","Ed","Muy Bueno","Accion",2010,1, R.drawable.leyes48),
            new Libros("dos","Nose","Digamos Q si","Terror",2020,2, R.drawable.elmonje)

    );
}
