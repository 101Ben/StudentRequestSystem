package com.example.slc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Navigator extends AppCompatActivity {

    String place, number, text, ssubjbect, ttutor;
    EditText subjbect, tutor;
    Button buttonsubmit, buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);

        buttonsubmit = (Button) findViewById(R.id.button18);
        buttonback = (Button) findViewById(R.id.button17);


        subjbect = (EditText) findViewById(R.id.editText14);
        ssubjbect = subjbect.getText().toString();
        tutor = (EditText) findViewById(R.id.editText13);
        ttutor = tutor.getText().toString();




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
}
