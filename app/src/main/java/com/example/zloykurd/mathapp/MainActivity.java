package com.example.zloykurd.mathapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.*;

import java.lang.Math.*;

public class MainActivity extends AppCompatActivity {
    String LOG_TAG = "main";
    TextView tw;
    EditText ed1;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String etStr1 = ed1.getText().toString();
        String etStr2 = ed2.getText().toString();
        tw = (TextView) findViewById(R.id.textView);
        int id = item.getItemId();


        if (id == R.id.sqrt) {
            if (etStr1.equals("") || etStr2.equals("")) {
                Toast t = Toast.makeText(this, "Введите данные", Toast.LENGTH_LONG);
                t.show();
            } else {
                double i = Double.valueOf(etStr1);
                double d = Double.valueOf(etStr2);
                double res = Math.min(i, d);
                tw.setText(String.valueOf(res));


                return true;
            }
        }
        if (id == R.id.pow) {
            if (etStr1.equals("") || etStr2.equals("")) {
                Toast t = Toast.makeText(this, "Введите данные", Toast.LENGTH_LONG);
                t.show();
            } else {
                double i = Double.valueOf(etStr1);
                double d = Double.valueOf(etStr2);
                double res = Math.min(i, d);
                tw.setText(String.valueOf(res));


                return true;
            }
        }
        if (id == R.id.sincostan) {
            double i = Double.valueOf(etStr1);
            double res = Math.sin(i);
            tw.setText(String.valueOf(res));
            return true;
        }
        if (id == R.id.asin) {
            double i = Double.valueOf(etStr1);
            double res = Math.asin(i);
            Log.d(LOG_TAG, "asin " + res);
            tw.setText(String.valueOf(res));
            return true;
        }
        if (id == R.id.max) {
            if (etStr1.equals("") || etStr2.equals("")) {
                Toast t = Toast.makeText(this, "Введите данные", Toast.LENGTH_LONG);
                t.show();
            } else {
                double i = Double.valueOf(etStr1);
                double d = Double.valueOf(etStr2);
                double res = Math.min(i, d);
                tw.setText(String.valueOf(res));


                return true;
            }
        }
        if (id == R.id.min) {
            if (etStr1.equals("") || etStr2.equals("")) {
                Toast t = Toast.makeText(this, "Введите данные", Toast.LENGTH_LONG);
                t.show();
            } else {
                double i = Double.valueOf(etStr1);
                double d = Double.valueOf(etStr2);
                double res = Math.min(i, d);
                tw.setText(String.valueOf(res));


                return true;
            }

        }
        if (id == R.id.round) {
            double i = Double.valueOf(etStr1);
            long res = Math.round(i);
            tw.setText(String.valueOf(res));
            return true;
        }
        if (id == R.id.summ) {
            String sString = etStr1;
            int i = sString.length();
            String result = "";
            int sumOfNumerals = 0;
            for (int q = 1; q < i + 1; q++) {
                String oneNumeral = sString.substring((q - 1), q);
                Log.d(LOG_TAG, "oneNumeral" + oneNumeral);
                sumOfNumerals += Integer.valueOf(oneNumeral);
            }
            result = String.valueOf(sumOfNumerals);
            tw.setText(result);

            return true;
        }
        if (id == R.id.arpu) {
            String s = etStr1;
            String[] mMass;
            double summ = 0;
            mMass = etStr1.split("0");
            for (int i = 0; i < mMass.length; i++) {

                summ += Double.valueOf(mMass[i]);


            }
            tw.setText(String.valueOf(summ/mMass.length));
            // tw.setText(String.valueOf((Double.valueOf(etStr1) + Double.valueOf(etStr2)) / 2));
            return true;
        }
        if (id == R.id.chetnoe_ne_chetnoe) {
            String s = etStr1;//2#3#5#4#8#20
            String[] mMass;
            String res = "";
            mMass = s.split("0");//{"2","3","5","4","8","20",,,}
            for (int i = 0; i < mMass.length; i++) {
                if (Integer.valueOf(mMass[i]) % 2 == 0) {
                    res = res + mMass[i] + "";
                }

            }
            if (res.equals("")) {
                res = "четных чисел нет";
            }
            tw.setText(res);
            return true;
        }
        if (id == R.id.ffor) {

            String s = etStr1;
            String[] massive;
            massive = s.split("5");
            int kolvo=0;


            for (int i = 0; i<massive.length; i++){
                int q = Integer.valueOf(massive[i]);
                if (q !=0){
                    kolvo++;
                }
            }
            tw.setText(String.valueOf(kolvo));
        }
        if (id == R.id.ffor) {

            String s = etStr1;
            String[] massive;
            massive = s.split("5");
            int summ=0;


            for (int i = 0; i<massive.length; i++){
                int q = Integer.valueOf(massive[i]);
                if (i<4 && i<15){
                    summ++;
                }else if (i>0 && i%5==0){
                    summ++;
                }
            }
            tw.setText(String.valueOf(summ));
        }


        return super.onOptionsItemSelected(item);
    }

    public void gogoresult(View view) {


    }
}
