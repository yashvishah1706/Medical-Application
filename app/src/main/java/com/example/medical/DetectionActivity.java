package com.example.medical;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.Range;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DetectionActivity extends AppCompatActivity{
    Button submit;
    private EditText age;
    private EditText bloodpressure;
    private EditText cholestrol;
    private EditText heartrate;
    private EditText depression;
    private Spinner spinnersex, spinnerchestpain, spinnerbloodsugar, spinnerecg;
//    Integer a,d,c;
//    String result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detection);
        age = (EditText) findViewById(R.id.editTextNumberDAge);
        bloodpressure = (EditText) findViewById(R.id.editTextNumberDBP);
        cholestrol = (EditText) findViewById(R.id.editTextNumberDCholestrol);
        heartrate = (EditText) findViewById(R.id.editTextNumberDHR);
        depression = (EditText) findViewById(R.id.editTextNumberDDepression);
        spinnersex = (Spinner)findViewById(R.id.spinner_Dsex);
        spinnerchestpain = (Spinner)findViewById(R.id.spinner_Dchestpain);
        spinnerbloodsugar = (Spinner)findViewById(R.id.spinner_Dbloodsugar);
        spinnerecg = (Spinner)findViewById(R.id.spinner_Decg);
        submit = findViewById(R.id.buttonDSubmit);
//
//        String a = age.getText().toString();
//        String bp = bloodpressure.getText().toString();
//        String c = cholestrol.getText().toString();
//        String hr = heartrate.getText().toString();
//        String d = depression.getText().toString();


        List<String> sex = new ArrayList<String>();
        sex.add("Sex");
        sex.add("Female");
        sex.add("Male");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(DetectionActivity.this, android.R.layout.simple_spinner_item, sex);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersex.setAdapter(dataAdapter);
        spinnersex.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String Sex = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), Sex, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // can leave this empty
            }
        });
        //chest pain
        List<String> chestpain = new ArrayList<String>();
        chestpain.add("Select if any");
        chestpain.add("Typical Angina");
        chestpain.add("Atypical Angina");
        chestpain.add("Non-anginal Pain");
        chestpain.add("Asymptomatic");
        chestpain.add("None");
        // Div Spinner implementing onItemSelectedListener
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(DetectionActivity.this, android.R.layout.simple_spinner_item, chestpain);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerchestpain.setAdapter(dataAdapter2);
        spinnerchestpain.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String chest_pain = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), chest_pain, Toast.LENGTH_LONG).show();
//                if(chest_pain!="none"){
//                    c = 1;
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // can leave this empty
            }
        });
        //blood sugar
        List<String> bloodsugar = new ArrayList<String>();
        bloodsugar.add("Blood Sugar");
        bloodsugar.add("Greater than 120 mg/dl");
        bloodsugar.add("Less than 120 mg/dl");
        // Div Spinner implementing onItemSelectedListener
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(DetectionActivity.this, android.R.layout.simple_spinner_item, bloodsugar);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerbloodsugar.setAdapter(dataAdapter3);
        spinnerbloodsugar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String sugar = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), sugar, Toast.LENGTH_LONG).show();
//                if(sugar == "Greater than 120 mg/dl"){
//                    int d = 1;
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // can leave this empty
            }
        });
        //blood sugar
        List<String> ecg = new ArrayList<String>();
        ecg.add("ECG");
        ecg.add("Normal");
        ecg.add("Having ST-T wave abnormality");
        ecg.add("Probable or definite left ventricular hypertrophy");
        // Div Spinner implementing onItemSelectedListener
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(DetectionActivity.this, android.R.layout.simple_spinner_item, ecg);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerecg.setAdapter(dataAdapter4);
        spinnerecg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String Ecg = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), Ecg, Toast.LENGTH_LONG).show();
//                if(Ecg == "Having ST-T wave abnormality" || Ecg == "Probable or definite left ventricular hypertrophy"){
//                    a=1;
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // can leave this empty
            }
        });
//        if(a==1||d==1||c==1){
//            result = "You are having heart problem";
//
//        }else{
//            result = "You are alright";
//        }
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetectionActivity.this, ResultActivity.class);
                startActivity(intent);
                finish();
//                intent.putExtra("Result",result);
            }
        });
    }

}