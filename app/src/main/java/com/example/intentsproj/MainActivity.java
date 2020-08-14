package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1 , input2;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Creating the LayoutInflater instance

        LayoutInflater li = getLayoutInflater();

        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        //Creating the Toast object

        Toast toast = new Toast(getApplicationContext());

        toast.setDuration(Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        toast.setView(layout);//setting the view of custom toast layout

        toast.show();



        input1 = findViewById(R.id.txtNum1);
        input2 = findViewById(R.id.txtNum2);

        btnOk = findViewById(R.id.btnSend);

       btnOk.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               //take the numbers
               String num1 = input1.getText().toString();
               String num2 = input2.getText().toString();

               //Create intent
               Intent i = new Intent( MainActivity.this , SecondActivity.class);

               //Load the numbers
               i.putExtra( "Extra1" , num1 );
               i.putExtra( "Extra2" , num2 );

               //send the content
               startActivity(i);

               //Toast
               Context context = getApplicationContext();
               CharSequence message = "You just clicked the OK button";
               int duration = Toast.LENGTH_SHORT;

               Toast toast = Toast.makeText( context , message , duration );

               //default podition of toast is  bottom
               toast.setGravity(Gravity.TOP| Gravity.LEFT , 0 , 0);

               //display toast
               toast.show();

           }
       });

    }
}