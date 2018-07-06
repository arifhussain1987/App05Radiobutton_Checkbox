package com.example.arifa.app05radiobuttoncheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.PublicKey;
import java.util.ArrayList;

public class Activity_Checkbox extends AppCompatActivity {

    CheckBox chkbox1, chkbox2, chkbox3, chkbox4, chkboxterms;
    Button btnsubmit;
    TextView txtresult;

    ArrayList<CheckBox> list_skill = new ArrayList<CheckBox>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__checkbox);

        chkbox1 = (CheckBox) findViewById(R.id.chkboxprogramming);
        chkbox2 = (CheckBox) findViewById(R.id.chkboxweb_design);
        chkbox3 = (CheckBox) findViewById(R.id.chkboxgraphics);
        chkbox4 = (CheckBox) findViewById(R.id.chkboxdata_struc);
        chkboxterms = (CheckBox) findViewById(R.id.chkboxterms);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        txtresult = (TextView) findViewById(R.id.txtshowchkbox);

        list_skill.add(chkbox1);
        list_skill.add(chkbox2);
        list_skill.add(chkbox3);
        list_skill.add(chkbox4);

    }

    public void checkterms(View view)
    {
        if(!chkboxterms.isChecked())
        {
            btnsubmit.setEnabled(false);
        }
        else
        {
            btnsubmit.setEnabled(true);
        }
    }

    public void submit(View view)
    {
        String message = "";

        for (CheckBox result : list_skill)
        {
            if(result.isChecked())
            {
                String chkboxData = result.getText().toString();
                message += chkboxData + "\n";
            }

        }

        txtresult.setText(message);
    }



}
