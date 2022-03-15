package com.example.days3app2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.days3app2.R;

import java.util.Locale;


public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username,password;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.getText().toString().toUpperCase(Locale.ROOT).equals("1234")){
                    login_sukses();

                }else
                {
                    Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    private void login_sukses(){
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //kirim username ke tampilan utama
        i.putExtra("Username",user_login);
        startActivity(i);

    }
}
