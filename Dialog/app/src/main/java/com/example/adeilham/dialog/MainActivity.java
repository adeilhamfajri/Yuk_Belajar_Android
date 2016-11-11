package com.example.adeilham.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tombol;

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
                kotak_dialog.setMessage("Anda akan menutup aplikasi ini ?");
                kotak_dialog.setTitle("Konfirmasi");

                //Mengatur tombol YA
                kotak_dialog.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    //menangani event dari KLIK YA
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                });

                //Mengatur tombol TIDAK
                kotak_dialog.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    //menangani event dari KLIK TIDAK
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                kotak_dialog.show();
            }
        });
    }
}
