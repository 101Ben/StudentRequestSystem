package com.example.slc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class CreateAccount extends AppCompatActivity {

    Button button, button2;
    EditText firstName, lastName, sid, sid2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_display);

        button = (Button) findViewById(R.id.buttonGoToSignInPage);
        button2 = (Button) findViewById(R.id.buttonSignUp);
        firstName = (EditText) findViewById(R.id.editText2);
        firstName.getText().toString();
        lastName = (EditText) findViewById(R.id.editText3);
        lastName.getText().toString();
        sid = (EditText) findViewById(R.id.editText4);
        sid.getText().toString();
        sid2 = (EditText) findViewById(R.id.editText5);
        sid2.getText().toString();

            //Toast.makeText(getApplicationContext(), "ID doesn't MATCH")
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (sid.getText().toString().equals(sid2.getText().toString())){
                    try {
                        StudentInfo newStudent = new StudentInfo(firstName.getText().toString(), lastName.getText().toString(), sid.getText().toString());
                        
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Invalid information", Toast.LENGTH_SHORT).show();
                    }

                    Toast.makeText(getApplicationContext(), "ACCOUNT CREATED", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                //else  textView.setText("Invalid SID");

            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }



    public void homePage (View view){
        //Do something in response to button
        Intent intent = new Intent(this, DashboardDisplay.class); // Can be changed to MainActivity
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
