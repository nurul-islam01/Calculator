package com.example.nurulislam.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;
    private Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnEql,btnAdd,btnSub,btnMul,btnDiv,btnClr;
    private boolean add,mul,sub,div,result = false;
    private float firstNumber, secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDot = findViewById(R.id.btnDot);
        btnAdd = findViewById(R.id.btnAdd);
        btnEql = findViewById(R.id.btnEql);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnClr = findViewById(R.id.btnClr);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (resultText.getText().toString() != ""){
                    resultText.setText(resultText.getText()+"0");
                }
                else if (result){
                    resultText.setText("0");
                    result = false;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("1");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"1");
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("2");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"2");
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("3");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"3");
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("4");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"4");
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("5");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"5");
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("6");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"6");
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("7");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"7");
                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("8");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"8");
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText("9");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+"9");
                }

            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result){
                    resultText.setText(".");
                    result = false;
                }else{
                    resultText.setText(resultText.getText()+".");
                }

            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultText.getText() == ""){
                    resultText.setText("");
                }else {
                    firstNumber = Float.parseFloat((String) resultText.getText());
                    add = true;
                    resultText.setText("");
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultText.getText() == ""){
                    resultText.setText("");
                }else {
                    firstNumber = Float.parseFloat((String) resultText.getText());
                    sub = true;
                    resultText.setText("");
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultText.getText() == ""){
                    resultText.setText("");
                }else {
                    firstNumber = Float.parseFloat((String) resultText.getText());
                    mul = true;
                    resultText.setText("");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultText.getText() == ""){
                    resultText.setText("");
                }else {
                    firstNumber = Float.parseFloat((String) resultText.getText());
                    div = true;
                    resultText.setText("");
                }
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNumber = Float.parseFloat(resultText.getText().toString());
                if (add){
                    resultText.setText(firstNumber+secondNumber+"");
                    add = false;
                }
                if (sub){
                    resultText.setText(firstNumber-secondNumber+"");
                    sub = false;
                }
                if (mul){
                    resultText.setText(firstNumber*secondNumber+"");
                    mul = false;
                }
                if (div){
                    resultText.setText(firstNumber/secondNumber+"");
                    div = false;
                }
            result = true;

            }
        });


    }
}
