package com.example.slc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Writing extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {

    String place, number, text, sname, ttutor;
    EditText num, name, tutor;
    Button buttonsubmit, buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing);

        num = (EditText) findViewById(R.id.editText10);
        this.number = num.getText().toString();
        name = (EditText) findViewById(R.id.editText8);
        sname = name.getText().toString();
        tutor = (EditText) findViewById(R.id.editText11);
        ttutor = tutor.getText().toString();


        buttonsubmit = (Button) findViewById(R.id.button8);
        buttonback = (Button) findViewById(R.id.button6);


        Spinner spinner = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.writing, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            // CREATE AN ACTION THAT IS SENDING THE INFORMATION
            // WE MIGHT USE A CLASS THAT COLLECT THE INFORMATION... AND ALSO MAKE SURE THAT THE CALL
            // TO THE CONSTRUCTOR HAPPENS ONCE, SINCE WE DON'T WANT MANY SAME REQUESTS
            @Override
            public void onClick(View v) {

                String message = "REQUEST SENT" ;
                Toast.makeText(getApplicationContext(), message , Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), DashboardDisplay.class);
                startActivity(intent);
                finish();

            }
        });

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), DashboardDisplay.class);
                startActivity(intent);
                finish();
            }
        });


    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        this.text = parent.getItemAtPosition(position).toString();
        //String message = this.place + " " + this.number + " :" + text ;
        //Toast.makeText(parent.getContext(), this.text , Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton3:
                if (checked)
                    this.place = "Table";
                break;
            case R.id.radioButton4:
                if (checked)
                    this.place = "Computer";
                break;
        }
    }
}
