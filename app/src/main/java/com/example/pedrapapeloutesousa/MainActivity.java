package com.example.pedrapapeloutesousa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

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
        System.out.println(opcaoSelecionada);

    }
}
