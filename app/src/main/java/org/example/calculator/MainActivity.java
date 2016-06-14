package org.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    String operandA = null;
    String operandB = null;
    String operator = null;
    boolean cont = false;
    boolean isFloat = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView) findViewById(R.id.display);
    }

    public void click0(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("0");
            } else {
                initial = initial + "0";
                display.setText(initial);
            }
        }
        else{
            display.setText("0");
            cont = false;
        }
    }

    public void click1(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("1");
            } else {
                initial = initial + "1";
                display.setText(initial);
            }
        }
        else{
            display.setText("1");
            cont = false;
        }
    }

    public void click2(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("2");
            } else {
                initial = initial + "2";
                display.setText(initial);
            }
        }
        else{
            display.setText("2");
            cont = false;
        }
    }

    public void click3(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("3");
            } else {
                initial = initial + "3";
                display.setText(initial);
            }
        }
        else{
            display.setText("3");
            cont = false;
        }
    }

    public void click4(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("4");
            } else {
                initial = initial + "4";
                display.setText(initial);
            }
        }
        else{
            display.setText("4");
            cont = false;
        }
    }

    public void click5(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("5");
            } else {
                initial = initial + "5";
                display.setText(initial);
            }
        }
        else{
            display.setText("5");
            cont = false;
        }
    }

    public void click6(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("6");
            } else {
                initial = initial + "6";
                display.setText(initial);
            }
        }
        else{
            display.setText("6");
            cont = false;
        }
    }

    public void click7(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("7");
            } else {
                initial = initial + "7";
                display.setText(initial);
            }
        }
        else{
            display.setText("7");
            cont = false;
        }
    }

    public void click8(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("8");
            } else {
                initial = initial + "8";
                display.setText(initial);
            }
        }
        else{
            display.setText("8");
            cont = false;
        }
    }

    public void click9(View view) {
        if(!cont) {
            String initial = display.getText().toString();
            if (initial.equals("0")) {
                display.setText("9");
            } else {
                initial = initial + "9";
                display.setText(initial);
            }
        }
        else{
            display.setText("9");
            cont = false;
        }
    }


    public void clickAdd(View view){
        if(operandA == null){
            operandA = display.getText().toString();
            operator ="A";
            display.setText("0");
        }
        else{
            operandB = display.getText().toString();
            String ans = calc(operandA, operator, operandB);
            display.setText(ans);
            operandA = ans;
        }
    }

    public void clickMul(View view){
        if(operator == null){
            operandA = display.getText().toString();
            operator ="M";
            display.setText("0");
        }
        else{
            operandB = display.getText().toString();
            display.setText(calc(operandA, operator, operandB));
        }
    }

    public void clickSub(View view){
        if(operator == null){
            operandA = display.getText().toString();
            operator ="S";
            display.setText("0");
        }
        else{
            operandB = display.getText().toString();
            display.setText(calc(operandA, operator, operandB));
        }
    }

    public void clickDivide(View view){
        if(operator == null){
            operandA = display.getText().toString();
            operator ="D";
            display.setText("0");
        }
        else{
            operandB = display.getText().toString();
            display.setText(calc(operandA, operator, operandB));
        }
    }

    public void clickDecimal(View view){
        String initial = display.getText().toString();
        initial = initial+".";
        display.setText(initial);
        isFloat = true;
    }

    public void clickCancel(View view){
        operator = null;
        operandA = null;
        operandB = null;
        cont = false;
        display.setText("0");
    }

    public void clickDel(View view){

    }

    public void clickEqual(View view){
        operandB = display.getText().toString();
        display.setText(calc(operandA, operator, operandB));
        operandA = null;
        operandB = null;
        operator = null;
    }

    public String calc(String a, String operator, String b) {
        if (isFloat || operator == "D") {
            cont = true;
            float x = Float.parseFloat(a);
            float y = Float.parseFloat(b);
            float ans;
            switch (operator) {
                case "A":
                    ans = x + y;
                    break;
                case "S":
                    ans = x - y;
                    break;
                case "M":
                    ans = x * y;
                    break;
                case "D":
                    try {
                        ans = x / y;
                    } catch (ArithmeticException e) {
                        ans = 0;
                    }
                    break;
                default:
                    ans = 0;
            }
            return Float.toString(ans);
        }
        else{
            cont = true;
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            int ans;
            switch (operator) {
                case "A":
                    ans = x + y;
                    break;
                case "S":
                    ans = x - y;
                    break;
                case "M":
                    ans = x * y;
                    break;
                default:
                    ans = 0;
            }
            return Integer.toString(ans);

        }
    }

}
