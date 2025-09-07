package com.example.mov_tp02;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mov_tp02.ModeloLibros.Libros;
import com.example.mov_tp02.Repository.LibrosRepository;

public class MainActivityViewModel extends AndroidViewModel {
    private final LibrosRepository repo;
    private MutableLiveData<Libros> mutableLibro= new MutableLiveData<>();
    private MutableLiveData<String> mutableError= new MutableLiveData<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        repo = new LibrosRepository();
    }
public void BuscarLibro(String Titulo){

    if (Titulo == null) mutableError.setValue("El titulo no puede ser Null");

    String t = Titulo.trim().toLowerCase();

        for (Libros l:repo.listaLibros){
            if (l.getAutor().toLowerCase().equals(t))
            {
                mutableLibro.setValue(l);
                Intent intent= new Intent(getApplication(), LibroEncontradoActivity.class);
                intent.putExtra("libroEncontrado",l);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplication().startActivity(intent);
            }

        }
}

    public LiveData<String> getMutableError(){
        if(mutableError==null)
            mutableError = new MutableLiveData<>();
        return mutableError;
    }


}

