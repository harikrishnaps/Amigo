package com.example.amigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText edit_text_email,edit_text_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edit_text_email    = findViewById(R.id.edit_text_email);
        edit_text_password = findViewById(R.id.edit_text_password);
    }

    public void authenticateUser(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }


   /* public void authenticateUser(View view) {

        String email = edit_text_email.getText().toString().trim();
        String password = edit_text_password.getText().toString().trim();


        if (email.isEmpty()) {
            edit_text_email.setError("Email is Required");
            edit_text_email.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edit_text_email.setError("Please enter a valid Email");
            edit_text_email.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            edit_text_password.setError("Password is Required");
            edit_text_password.requestFocus();
            return;
        }

        if (password.length() < 6) {
            edit_text_password.setError("Minimum length is 6");
            edit_text_password.requestFocus();
            return;
        }

        *//*mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {

                    Intent startActivity = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity.addCategory(Intent.CATEGORY_HOME);
                    startActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(startActivity);
                    finish();
                    System.exit(0);
                    startActivity(startActivity);

                } else {
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }

            }
        });*//*

    }*/


    public void reg(View view)
    {
        startActivity(new Intent(this,Sign_Up.class));
    }
}
