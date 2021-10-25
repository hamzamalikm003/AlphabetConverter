package com.example.alphabetconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edittext;
    private Button btn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext=findViewById(R.id.InputField);
        btn=findViewById(R.id.submit);
        textView=findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (Character.isLowerCase(edittext.getText().toString().charAt(0))) {
                        String str="Upper Case: ";
                        textView.setText(str+Character.toString(Character.toUpperCase(edittext.getText().toString().charAt(0))));

                    } else {
                        String str="Lower Case: ";
                        textView.setText(str+Character.toString(Character.toLowerCase(edittext.getText().toString().charAt(0))));

                    }
                }catch (Exception e){
                    textView.setText("");
                    textView.setHint("Enter any Character");
                }
            }
        });
    }

}