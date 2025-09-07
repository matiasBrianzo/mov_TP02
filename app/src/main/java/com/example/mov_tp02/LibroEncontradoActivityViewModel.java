package com.example.mov_tp02;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mov_tp02.ModeloLibros.Libros;

public class LibroEncontradoActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Libros> mutableLibro;

    public LibroEncontradoActivityViewModel(@NonNull Application application) {
        super(application);
    }
    public LiveData<Libros> getMutableLibros(){
        if(mutableLibro==null)
            mutableLibro = new MutableLiveData<>();
        return mutableLibro;
    }

    public void recuperLibroEnviado(Intent intent)
    {
        Libros libroEnviado=(Libros)intent.getSerializableExtra("libroEncontrado",Libros.class);
        mutableLibro.setValue(libroEnviado);
    }
}
