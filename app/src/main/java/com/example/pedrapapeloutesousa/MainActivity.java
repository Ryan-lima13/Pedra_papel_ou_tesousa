package com.example.pedrapapeloutesousa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){

        this.opcaoSelecionada("pedra");

    }
    public void selecionadoTesoura(View view){

        this.opcaoSelecionada("tesoura");

    }
    public void selecionadoPapel(View view){

        this.opcaoSelecionada("papel");

    }


    public  void opcaoSelecionada(String opcaoSelecionada){
        ImageView imageResultado = findViewById(R.id.img_resultado);
        int numero = new Random().nextInt(3
        );
        String[]opcoes ={"pedra","tesoura","papel"};
        String opcaoApp= opcoes[numero];
        switch (opcaoApp){
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;


        }
        System.out.println(opcaoApp);

    }
}
