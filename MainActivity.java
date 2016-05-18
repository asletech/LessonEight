package com.example.android.lesson8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText pass_word;
    private Button button_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    //This is a test fever
    public void addListenerOnButton(){
        pass_word = (EditText) findViewById(R.id.editText);
        button_sbm = (Button)findViewById(R.id.button);
        button_sbm.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                MainActivity.this, pass_word.getText(),Toast.LENGTH_LONG
                        ).show();
                    }
                }
        );

    }
}
