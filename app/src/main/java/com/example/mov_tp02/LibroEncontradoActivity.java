package com.example.mov_tp02;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mov_tp02.ModeloLibros.Libros;
import com.example.mov_tp02.databinding.ActivityLibroEncontradoBinding;
import com.example.mov_tp02.databinding.ActivityMainBinding;

public class LibroEncontradoActivity extends AppCompatActivity {

    private ActivityLibroEncontradoBinding binding;
    private LibroEncontradoActivityViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= ActivityLibroEncontradoBinding.inflate(getLayoutInflater());
        vm= new LibroEncontradoActivityViewModel(getApplication());
        setContentView(binding.getRoot());
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(LibroEncontradoActivityViewModel.class);

        vm.getMutableLibros().observe(this, new Observer<Libros>() {
            @Override
            public void onChanged(Libros libros) {
                binding.tvTitle.setText(libros.getAutor());
                binding.tvDescription.setText(libros.getDescripcion());

                binding.ivCover.setImageResource(libros.getFoto());
            }
        });
        vm.recuperLibroEnviado(getIntent());

        binding.btnBack.setOnClickListener(v -> finish());
    }
}