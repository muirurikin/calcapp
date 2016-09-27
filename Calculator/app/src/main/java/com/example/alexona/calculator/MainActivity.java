package com.example.alexona.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , button10 , buttonC , buttonEqual , buttonsqrt ;

    EditText edt1 ;

    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ,mSquareroot ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(this);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonAdd.setOnClickListener(this);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonSub.setOnClickListener(this);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonMul.setOnClickListener(this);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonDivision.setOnClickListener(this);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonC.setOnClickListener(this);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        buttonEqual.setOnClickListener(this);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt1.setOnClickListener(this);
        buttonsqrt = (Button) findViewById(R.id.buttonsqrt);
        buttonsqrt.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button1:
                edt1.setText(edt1.getText() + "1");
                break;
            case R.id.button2:
                edt1.setText(edt1.getText() + "2");
            case R.id.button3:
                edt1.setText(edt1.getText() + "3");
                break;
            case R.id.button4:
                edt1.setText(edt1.getText() + "4");
                break;
            case R.id.button5:
                edt1.setText(edt1.getText() + "5");
                break;
            case R.id.button6:
                edt1.setText(edt1.getText() + "6");
                break;
            case R.id.button7:
                edt1.setText(edt1.getText() + "7");
                break;
            case R.id.button8:
                edt1.setText(edt1.getText() + "8");
                break;
            case R.id.button9:
                edt1.setText(edt1.getText() + "9");
                break;
            case R.id.button0:
                edt1.setText(edt1.getText() + "0");
                break;
            case R.id.buttonadd:
                if (edt1 == null) {
                    edt1.setText("");
                } else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                }
                break;
            case R.id.buttonsub:
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true;
                edt1.setText(null);
                break;
            case R.id.buttonmul:
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true;
                edt1.setText(null);
                break;
            case R.id.buttonsqrt:
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSquareroot = true;
                edt1.setText(null);
                break;
            case R.id.buttondiv:
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mDivision = true;
                edt1.setText(null);
                break;
            case R.id.buttoneql:
                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition == true) {

                    edt1.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    edt1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    edt1.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    edt1.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
                break;
            case R.id.buttonC:
                edt1.setText("");
                break;
            case R.id.button10:
                edt1.setText(edt1.getText() + ".");
                break;
            default:
                break;
        }
    }
}