package com.example.amigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Sign_Up extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    String user;
    String traveller,guide,travel_agency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);

        spinner =findViewById(R.id.user_type);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.user_list,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        traveller     = "Traveller";
        guide         = "Guide";
        travel_agency = "Travel Agency";

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        user = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void register(View view)
    {
        if(user.equals(traveller))
        {
            startActivity(new Intent(this,MainActivity.class));
        }
        else if(user.equals(guide))
        {
            startActivity(new Intent(this,Guide.class));
        }
        else if(user.equals(travel_agency))
        {
            startActivity(new Intent(this,Agency.class));
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Please select a user",Toast.LENGTH_SHORT).show();
        }

    }

}
