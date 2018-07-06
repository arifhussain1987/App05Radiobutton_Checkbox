package com.example.arifa.app05radiobuttoncheckbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView txtresult;

    private static String correctAnswer = "Charles Babbage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioquiz);
        txtresult = (TextView) findViewById(R.id.txtresult);

    }

    public RadioButton getselectedradioid()
    {
        int radioId = radioGroup.getCheckedRadioButtonId();
        return radioButton = findViewById(radioId);
    }

    public void getradiodata(View view)
    {

        txtresult.setText(getselectedradioid().getText());
    }

    public void showresult(View view)
    {

        String user_selected_answer = getselectedradioid().getText().toString().trim();

        if(user_selected_answer.equals(correctAnswer))
            Toast.makeText(getApplicationContext(), "Hurray! Right Answer", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(), "Sorry! Wrong Answer", Toast.LENGTH_SHORT).show();
    }

    public void next_activity(View view)
    {
        startActivity(new Intent(getApplicationContext(), Activity_Checkbox.class));
    }

}
