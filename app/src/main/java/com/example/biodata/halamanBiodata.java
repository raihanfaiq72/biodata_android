package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halamanBiodata extends AppCompatActivity {

    Button nomorhape,email,alamat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_biodata);

        nomorhape = findViewById(R.id.btnTlp);
        email     = findViewById(R.id.btnEmail);
        alamat    = findViewById(R.id.btnAlamat);

        nomorhape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomor="081999967373";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(Uri.fromParts("tel",nomor,null));
                startActivity(memanggil);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rtc882");
                String[] to={"faiq.fhr03@gmail.com"};
                emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
                startActivity(emailIntent);
            }
        });

        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent,omahku;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/maps/GUTWbwGvwjFfCQk77"));
                omahku = Intent.createChooser(intent, "lihat omahku");
                startActivity(omahku);
            }
        });
    }

}