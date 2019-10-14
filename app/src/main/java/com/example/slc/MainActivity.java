package com.example.slc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileNotFoundException;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
   // Database data ;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //try {
            //data = new Database();
            textView = (TextView) findViewById(R.id.textView);
            editText = (EditText) findViewById(R.id.editText);
            button = (Button) findViewById(R.id.button2);

//            button.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v) {
//                    String code = editText.getText().toString();
//                    if(!code.equals("")){
//
//                        if(data.equals(code)){
//
//                            Intent intent = new Intent(getApplicationContext(), DashboardDisplay.class);
//                            startActivity(intent);
//                            finish();
//                        }
////                        else if (code.equals("")){
////                            textView.setText("Missing SID");
////                        }
//                        else {
//                            textView.setText("Invalid SID");
//                        }
//                    }
//                }
//            });
//
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//        }catch (FileNotFoundException e){
//
//        }catch (Exception e){
//            System.err.println();
//        }





        ///// TEST


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(getApplicationContext(), DashboardDisplay.class);
                    startActivity(intent);
                    finish();

                    }
                }
            );

        //////  TEST
    }

    /** Called when the user taps the SIGN IN button */
    public void signIn (View view){
        //Do something in response to button
        Intent intent = new Intent(this, DashboardDisplay.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Called when the user taps the Create a new account button */
    public void createAccount( View view){
        //Do something in response
        Intent intent = new Intent(this, CreateAccount.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}
