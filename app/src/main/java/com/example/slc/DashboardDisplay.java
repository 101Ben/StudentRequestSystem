package com.example.slc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DashboardDisplay extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_display);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.center_option, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);




        button1 = (Button) findViewById(R.id.infobutton);
        button2 = (Button) findViewById(R.id.button7);  // log out Button



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Infomation.class);
                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }



    public void info (View view){
        //Do something in response to button
        Intent intent = new Intent(this, Infomation.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void log_out (View view){
        //Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT ).show();

        if (text.equals("Math and Science")){

            Intent intent = new Intent(getApplicationContext(), MathAndScience.class);
            startActivity(intent);
            finish();
        }

        else if (text.equals("Accounting and Business")){
            Intent intent = new Intent(getApplicationContext(), AccountingAndBusiness.class);
            startActivity(intent);
            finish();
        }
        else if (text.equals("Writing")){
            Intent intent = new Intent(getApplicationContext(), Writing.class);
            startActivity(intent);
            finish();
        }
        else if (text.equals("World Language")){
            Intent intent = new Intent(getApplicationContext(), WorldLanguages.class);
            startActivity(intent);
            finish();
        }
        else if (text.equals("HS 2642A Bio/Chem")){
            Intent intent = new Intent(getApplicationContext(), HsBioChem.class);
            startActivity(intent);
            finish();
        }
        else if (text.equals("Workshops")){
            Intent intent = new Intent(getApplicationContext(), Workshops.class);
            startActivity(intent);
            finish();
        }
        else if (text.equals("Navigator")){
            Intent intent = new Intent(getApplicationContext(), Navigator.class);
            startActivity(intent);
            finish();
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
