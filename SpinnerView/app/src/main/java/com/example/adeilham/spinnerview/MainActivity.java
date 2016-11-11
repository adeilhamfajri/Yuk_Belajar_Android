package com.example.adeilham.spinnerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerBuah;
    String[] daftar_buah = {
            "Jeruk",
            "Mangga",
            "Apel",
            "Sirsak",
            "Rambutan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerBuah = (Spinner) findViewById(R.id.spinnerBuah);

        //Mengatur isi spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, daftar_buah);
        spinnerBuah.setAdapter(adapter);

        //mengontrol pemilihan pada item di spinnerView
        spinnerBuah.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int indeks = parent.getSelectedItemPosition();

                Toast.makeText(getApplication(), "Anda memilih " + daftar_buah[indeks], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
