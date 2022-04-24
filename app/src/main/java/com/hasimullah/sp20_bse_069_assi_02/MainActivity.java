package com.hasimullah.sp20_bse_069_assi_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnBack,btnOpen;
    EditText input;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SP20_BSE_069_Assi_02");

        btnOne = findViewById(R.id.buttonOne);
        btnTwo = findViewById(R.id.buttonTwo);
        btnThree = findViewById(R.id.buttonThree);
        btnFour = findViewById(R.id.buttonFour);
        btnFive = findViewById(R.id.buttonFive);
        btnSix = findViewById(R.id.buttonSix);
        btnSeven = findViewById(R.id.buttonSeven);
        btnEight = findViewById(R.id.buttonEight);
        btnNine = findViewById(R.id.buttonNine);
        btnZero = findViewById(R.id.buttonZero);
        btnBack = findViewById(R.id.buttonBack);
        btnOpen = findViewById(R.id.buttonOpen);
        input = findViewById(R.id.input);

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = "1234";
                String code = input.getText().toString();

                if(code.equals(pass)){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,Locker_Home.class);
                    startActivity(intent);

                }
                else{

                    counter++;
                    Toast.makeText(MainActivity.this, "Wrong Key "+counter, Toast.LENGTH_SHORT).show();
                    if(counter == 3){
                        finish();
                    }

                }
            }
        });


    }
    public void one(View v){
        btnClick(input,btnOne,"1");
    }
    public void two(View v){
        btnClick(input,btnTwo,"2");
    }
    public void three(View v){
        btnClick(input,btnThree,"3");
    }

    public void four(View v){
        btnClick(input,btnFour,"4");
    }

    public void five(View v){
        btnClick(input,btnFive,"5");
    }

    public void six(View v){
        btnClick(input,btnSix,"6");
    }

    public void seven(View v){
        btnClick(input,btnSeven,"7");
    }

    public void eight(View v){
        btnClick(input,btnEight,"8");
    }

    public void nine(View v){
        btnClick(input,btnZero,"9");
    }

    public void zero(View v){
        btnClick(input,btnZero,"0");
    }
    public void back(View v){
        Editable currentText = input.getText();
        if(currentText.length()>0){
            currentText.delete(currentText.length()-1,currentText.length());
            input.setText(currentText);
        }
    }
    public void open(View v){
        String pass = "1234";
        String code = input.getText().toString();

        if(code.equals(pass)){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Locker_Home.class);
            startActivity(intent);

        }
        else{
            counter++;
            Toast.makeText(this, counter, Toast.LENGTH_SHORT).show();

        }
    }

    public void btnClick(EditText txt,Button key,String num){
        String preText = input.getText().toString();
        String number = num;

        input.setText(preText+number);
    }


}
