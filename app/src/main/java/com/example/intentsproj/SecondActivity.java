package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView tvNum1 , tvNum2 , answer;
    String fin;
    Button add , subtract , multiply , divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //assigning text areas
        tvNum1 = findViewById( R.id.textV1);
        tvNum2 = findViewById( R.id.textV2);
        answer = findViewById(R.id.txtAns);

        //retrieve from activity 1
        tvNum1.setText( getIntent().getStringExtra( "Extra1"));
        tvNum2.setText( getIntent().getStringExtra( "Extra2"));

        //assigning buttons
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnMulty);
        divide = findViewById(R.id.btnDiv);


        //addition
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Conversion to integer type
                int number1 = Integer.parseInt( tvNum1.getText().toString() );
                int number2 = Integer.parseInt( tvNum2.getText().toString() );

                int result = number1 + number2;

                answer.setText( getIntent().getStringExtra( "Extra1") + " + " + getIntent().getStringExtra( "Extra2") + " = " + String.valueOf(result) );

            }
        });

        //Subtraction
        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //Conversion to integer type
                int number1 = Integer.parseInt( tvNum1.getText().toString() );
                int number2 = Integer.parseInt( tvNum2.getText().toString() );

                int result = number1 - number2;

                answer.setText( getIntent().getStringExtra( "Extra1") + " - " + getIntent().getStringExtra( "Extra2") + " = " + String.valueOf(result));

            }
        });

        //Multiplication
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //Conversion to integer type
                int number1 = Integer.parseInt( tvNum1.getText().toString() );
                int number2 = Integer.parseInt( tvNum2.getText().toString() );

                int result = number1 * number2;

                answer.setText( getIntent().getStringExtra( "Extra1") + " * " + getIntent().getStringExtra( "Extra2") + " = " + String.valueOf(result));

            }
        });

        //Division
        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                //Conversion to integer type
                int number1 = Integer.parseInt( tvNum1.getText().toString() );
                int number2 = Integer.parseInt( tvNum2.getText().toString() );

                int result = number1 / number2;

                answer.setText( getIntent().getStringExtra( "Extra1") + " / " + getIntent().getStringExtra( "Extra2") + " = " + String.valueOf(result));

            }
        });



    }
}