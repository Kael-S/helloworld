package com.example.jchuah.myapplication;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.Source;

public class ColorActivity extends AppCompatActivity {

    static String tag = "com.example.jchuah.myapplication";

    Bundle groceries;

    Bundle sendBundle = new Bundle();


    public  void onColorClick(View source) {
        Log.i(tag, "Launching Name and Color activity");
        Intent NameColor = new Intent(this, NameandColor.class);
        NameColor.putExtra("groceries", groceries);

        Button colorButton = (Button) source;
        ColorDrawable bgColor = (ColorDrawable) source.getBackground();

        groceries.putInt("colorclick", bgColor.getColor());

        startActivity(NameColor);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorscreen);
        groceries = getIntent().getBundleExtra("groceries");
        Log.i("GROCERIES!", groceries.getString("name"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
