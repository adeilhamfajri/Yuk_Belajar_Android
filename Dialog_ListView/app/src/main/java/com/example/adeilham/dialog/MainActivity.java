package com.example.adeilham.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button tombol;

    String[] daftar_makanan = {
            "Randang Hitam",
            "Dendeng Batokok",
            "Soto Lamongan",
            "Cubadak Gulai",
            "Nasi Uduk",
            "Ayan Patah Lado",
            "Baluik Singgalang"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol = (Button) findViewById(R.id.buttonDialog);
        tombol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder kotak_dialog = new AlertDialog.Builder(MainActivity.this);

                kotak_dialog.setCancelable(false); //membuat agar aplikasi freeze, kotak dialog bersifat seperti modal
                kotak_dialog.setTitle("Daftar Makanan");

                kotak_dialog.setItems(daftar_makanan, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplication(), "Anda memilih " + daftar_makanan[which], Toast.LENGTH_SHORT).show();
                    }
                });

                kotak_dialog.show();
            }
        });
    }
}
