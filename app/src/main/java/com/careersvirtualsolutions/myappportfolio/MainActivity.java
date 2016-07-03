package com.careersvirtualsolutions.myappportfolio;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button PM, SH, BiB, MYM, GU, C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        PM = (Button) findViewById(R.id.PM);
        SH = (Button) findViewById(R.id.SH);
        BiB = (Button) findViewById(R.id.BiB);
        MYM = (Button) findViewById(R.id.MYM);
        GU = (Button) findViewById(R.id.GU);
        C = (Button) findViewById(R.id.C);

        PM.setOnClickListener(this);
        SH.setOnClickListener(this);
        BiB.setOnClickListener(this);
        MYM.setOnClickListener(this);
        GU.setOnClickListener(this);
        C.setOnClickListener(this);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/monserga_outline/Monserga-regular-FFP.ttf");
        textView.setTypeface(typeface);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.PM:
                Toast.makeText(MainActivity.this, "This button will launch my 'Popular Movies' App", Toast.LENGTH_LONG).show();
                break;
            case R.id.SH:
                Toast.makeText(MainActivity.this, "This button will launch my 'Stock Hawk' App", Toast.LENGTH_LONG).show();
                break;
            case R.id.BiB:
                Toast.makeText(MainActivity.this, "This button will launch my 'Build it Bigger' App", Toast.LENGTH_LONG).show();
                break;
            case R.id.MYM:
                Toast.makeText(MainActivity.this, "This button will launch my 'Make Your App Material' App", Toast.LENGTH_LONG).show();
                break;
            case R.id.GU:
                Toast.makeText(MainActivity.this, "This button will launch my Go 'Ubiquitous App", Toast.LENGTH_LONG).show();
                break;
            case R.id.C:
                Toast.makeText(MainActivity.this, "This button will launch my 'Capstone' App", Toast.LENGTH_LONG).show();
                break;
            default:
                break;

        }
    }
}
