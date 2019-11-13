package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
        super.onResume();
        //en este punto la aplicacion ya carg
        // this en actvity tine el pode de cotrolar todsa la pantalla
        //this es un tipo contexto
        Toast.makeText(this, "Aplicacion iniciada", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Aplicacion Stopeada", Toast.LENGTH_LONG).show();
    }

}
