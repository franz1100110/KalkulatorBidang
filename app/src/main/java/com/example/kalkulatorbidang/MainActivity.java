package com.example.kalkulatorbidang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText sisifield, alasfield, tinggifield, radiusfield;
    String sisii, alass, tinggii, radiuss;
    TextView keliling,luas;
    Double sisi=0.0;
    Double alas=0.0;
    Double tinggi=0.0;
    Double radius=0.0;
    Double result1;
    Double result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sisifield=(EditText) findViewById(R.id.sisifield);
        alasfield=(EditText) findViewById(R.id.alasfield);
        tinggifield=(EditText) findViewById(R.id.tinggifield);
        radiusfield=(EditText) findViewById(R.id.radiusfield);
        keliling=(TextView) findViewById(R.id.keliling);
        luas=(TextView) findViewById(R.id.luas);
    }
    public void persegi(View ph) {
        sisii = sisifield.getText().toString();
        if (TextUtils.isEmpty(sisii))
        {
            keliling.setText("Keliling persegi tidak bisa dihitung karena sisi persegi belum diisi");
            luas.setText("Luas persegi tidak bisa dihitung karena sisi persegi belum diisi");
        }
        else {
                sisi = Double.parseDouble(sisifield.getText().toString());
                result1 = 4 * sisi;
                result2 = sisi * sisi;
                keliling.setText("Kelilingnya adakah :" + result1);
                luas.setText("Luas nya adalah :" + result2);
        }
    }
    public void segitiga(View ph) {
        sisii = sisifield.getText().toString();
        alass = alasfield.getText().toString();
        tinggii = tinggifield.getText().toString();
        if(TextUtils.isEmpty(sisii)||TextUtils.isEmpty(alass)||TextUtils.isEmpty(tinggii))
        {
            keliling.setText("Keliling tidak bisa dihitung karena sisi/alas/tinggi belum diisi!");
            luas.setText("Luas tidak bisa dihitung karena sisi/alas/tinggi belum diisi!");
        }
        else{
            sisi = Double.parseDouble(sisifield.getText().toString());
            alas = Double.parseDouble(alasfield.getText().toString());
            tinggi = Double.parseDouble(tinggifield.getText().toString());
            result1 = sisi * 3;
            result2 = (alas*tinggi)/2;
            keliling.setText("Kelilingnya adakah :" + result1);
            luas.setText("Luas nya adalah :" + result2);
        }
    }
    public void lingkaran(View ph) {
        radiuss = radiusfield.getText().toString();
        if(TextUtils.isEmpty(radiuss))
        {
            keliling.setText("Keliling tidak bisa dihitung karena radius belum dimasukkan!");
            luas.setText("Luas tidak bisa dihitung karena radius belum dimasukkan!");
        }
        else
        {
            radius = Double.parseDouble((radiusfield.getText()).toString());
            result1 = 3.14*radius*radius;
            result2 = 3.14*2*radius;
            keliling.setText("Kelilingnya adakah :" + result1);
            luas.setText("Luas nya adalah :" + result2);
        }
    }
}